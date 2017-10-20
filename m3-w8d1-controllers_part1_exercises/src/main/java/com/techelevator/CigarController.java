package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CigarController {

	
	@RequestMapping(path="/cigarParty", method=RequestMethod.GET)
	public String displaySquirrelPartyInput() {
		
		return "cigarParty";
	}
	
	@RequestMapping(path="/cigarPartyResult", method=RequestMethod.POST)
	public String displaySquirrelPartyResult(@ModelAttribute SquirrelParty sp, ModelMap modelHolder){
		modelHolder.put("sp", sp);
		
		return "cigarPartyResult";
	}
}
