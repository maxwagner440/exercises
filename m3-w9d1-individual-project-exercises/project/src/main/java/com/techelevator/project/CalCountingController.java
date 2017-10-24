package com.techelevator.project;


import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.objects.CaloriesInput;
import com.techelevator.objects.CaloriesInputDAO;
import com.techelevator.objects.Client;
import com.techelevator.objects.ClientDAO;
import com.techelevator.objects.ClientJDBCDAO;




@Controller 
public class CalCountingController {

	
	@Autowired
	ClientDAO clientDao;
	
	@Autowired
	CaloriesInputDAO caloriesDao;
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String displayGreeting(ModelMap modelHolder) {
		if(! modelHolder.containsAttribute("Verify")){
			modelHolder.put("Verify", new Client());
		}
		return "home";
	}
	
	@RequestMapping(path="/", method=RequestMethod.POST)
	public String userLogin(@RequestParam String username, @RequestParam String password, HttpSession session) {
		Client client = clientDao.getClientByUsername(username);
		
//		if(client.getPassword().equals(password)){
			session.setAttribute("client", client);
//		}
//		else{
//			return "redirect:/";
//		}
		
		return "redirect:/allLogs";
	}

	
	@RequestMapping(path="/newLog", method=RequestMethod.GET)
	public String gotoNewLogEntry(ModelMap modelHolder, HttpSession session){
		if(! modelHolder.containsAttribute("newLog")){
			modelHolder.put("newLog", new CaloriesInput());
		}
		if(session.getAttribute("client") == null){
			return "redirect:/";
		}
		
		return "newLog";
	}
	
	@RequestMapping(path="/newLog", method=RequestMethod.POST)
	public String createEntryInDatabase(@RequestParam BigDecimal caloriesConsumed, HttpSession session){
		Client client = (Client) session.getAttribute("client");
		CaloriesInput input = new CaloriesInput();
		input.setCaloriesNeeded(clientDao.calculateCaloricNeeds(client.getClientId()));
		input.setCaloriesConsumed(caloriesConsumed);
		caloriesDao.saveNewEntry(input, client.getClientId());
		return "redirect:/allLogs";
	}
	
	@RequestMapping(path="/createNewProfile", method=RequestMethod.GET)
	public String displayCreateNewProfile(ModelMap modelHolder, HttpSession session){
		if(! modelHolder.containsAttribute("createNewProfile")){
			modelHolder.put("createNewProfile", new Client());
		}
		if(session.getAttribute("client") == null){
			return "redirect:/";
		}
		
		return "createNewProfile";
	}
	
	@RequestMapping(path="/createNewProfile", method=RequestMethod.POST)
	public String creatingNewProfile(){
		
		return "redirect:/newLog";
	}
	
	@RequestMapping(path="/allLogs", method=RequestMethod.GET)
		public String showAllLogs(ModelMap modelHolder, HttpSession session){
		
		
		Client client = (Client) session.getAttribute("client");
		if(session.getAttribute("client") == null){
			return "redirect:/";
		}
		
		List<CaloriesInput> input = caloriesDao.getAllEntriesByUsername(client.getUsername());
		
		modelHolder.addAttribute("allInput", input);

		return "allLogs";
		}
	
	

}
