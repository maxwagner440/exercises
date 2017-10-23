package com.techelevator.validation.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;

@Controller
public class UserController {
	// GET: /
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}
	

	// Add the following Controller Actions
	// GET: /register
	// Return the empty registration view
	@RequestMapping(path="/register", method=RequestMethod.GET)
	public String toRegisterPage(ModelMap modelHolder){
		if(! modelHolder.containsAttribute("register")){
			modelHolder.put("register", new Registration());
		}
		return "register";
	}
	
	
	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)

	@RequestMapping(path="/register", method=RequestMethod.POST)
	public String registeringTheNewUser(){
		
		return "redirect:/registerSucess";
	}
	// GET: /login
	// Return the empty login view
	@RequestMapping(path="/signIn", method=RequestMethod.GET)
	public String gotoLoginScreen(ModelMap modelHolder){
		if(! modelHolder.containsAttribute("signIn")){
			modelHolder.put("signIn", new Login());
		}
		return"signIn";
	}
	// POST: /login
	// Validate the model and redirect to login (if successful) or return the
	// login view (if validation fails)

	@RequestMapping(path="/signIn", method=RequestMethod.POST)
	public String signUserIn(@Valid @ModelAttribute Login signIn, BindingResult result, RedirectAttributes flash){
		
		
		return"loginSuccess";
	}
	// GET: /confirmation
	// Return the confirmation view
}
