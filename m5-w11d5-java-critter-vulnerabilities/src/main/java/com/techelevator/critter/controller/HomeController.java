package com.techelevator.critter.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.critter.model.Message;
import com.techelevator.critter.model.MessageDAO;
import com.techelevator.critter.model.User;
import com.techelevator.critter.model.UserDAO;

@Controller
public class HomeController {
	
	private MessageDAO messageDAO;
	private UserDAO userDAO;

	@Autowired
	public HomeController(MessageDAO messageDAO) {
		this.messageDAO = messageDAO;
	}
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String showHomePage(Map<String, Object> model, HttpServletRequest request) {
	
		model.put("messages", messageDAO.getPublicMessages(10));
		return "home";
	}
	
	@RequestMapping(path="/deleteMessage", method=RequestMethod.POST)
	public String deletePage(HttpServletRequest request, @RequestParam Long id, @RequestParam String fromUsername){
		String userName = (String) request.getSession().getAttribute("currentUser");
		if(userName.equals(fromUsername)){
			
			messageDAO.deleteMessage(id);
			return "redirect:/";
		}
			
		else{
			return "redirect:/";
		}
		
	};
}
