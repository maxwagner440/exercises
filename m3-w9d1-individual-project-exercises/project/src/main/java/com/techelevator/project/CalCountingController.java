package com.techelevator.project;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.objects.Calories;
import com.techelevator.objects.CaloriesDAO;
import com.techelevator.objects.Client;
import com.techelevator.objects.ClientDAO;
import com.techelevator.objects.ClientJDBCDAO;



@Controller 
public class CalCountingController {

	
	@Autowired
	ClientDAO clientDao;
	
	@Autowired
	CaloriesDAO caloriesDao;
	
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
	
	@RequestMapping(path="/allLogs", method=RequestMethod.GET)
		public String showAllLogs(ModelMap modelHolder){
		List<Calories> allInput = caloriesDao.getAllEntries();
		List<Client> allClients = clientDao.getAllClients();
		modelHolder.addAttribute("allInput", allInput);
		modelHolder.addAttribute("allClients", allClients);
			return "allLogs";
		}
	
	

}
