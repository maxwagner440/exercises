package com.techelevator.project;


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
	public String displayGreeting() {
		
		return "home";
	}
	
	@RequestMapping(path="/newLog", method=RequestMethod.GET)
	public String gotoNewLogEntry(ModelMap modelHolder){
		if(! modelHolder.containsAttribute("newLog")){
			modelHolder.put("newLog", new Client());
		}
		return "newLog";
	}
	
	@RequestMapping(path="/newLog", method=RequestMethod.POST)
	public String createEntryInDatabase(){
		return "redirect:currentLog";
	}
	
	@RequestMapping(path="/allLogsVerify", method=RequestMethod.GET)
	public String displayUsernameInput(ModelMap modelHolder){
		if(! modelHolder.containsAttribute("allLogsVerify")){
			modelHolder.put("allLogsVerify", new Client());
		}
		
		return "allLogsVerify";
	}
	@RequestMapping(path="/allLogsVerify", method=RequestMethod.POST)
	public String verifyUserId(HttpSession session, @RequestParam String username){
		Client client = clientDao.getClientByUsername(username);
		session.setAttribute("allLogs", client);
		
		return "redirect:/allLogs";
	}
	
	@RequestMapping(path="/allLogs", method=RequestMethod.GET)
		public String showAllLogs(ModelMap modelHolder, HttpSession session){
		if(session.getAttribute("allLogs") == null){
			session.setAttribute("allLogs", new Client());
		}
		
		Client client = (Client) session.getAttribute("allLogs");
		
		List<CaloriesInput> input = caloriesDao.getAllEntriesByUsername(client.getUsername());
		
		modelHolder.addAttribute("allInput", input);

		return "allLogs";
		}
	
	

}
