package com.techelevator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FizzBuzzController {

	@RequestMapping(path="/fizzBuzz", method=RequestMethod.GET)
	public String displayFizzBuzzInput() {
		
		return "fizzBuzzInput";
	}
	
	@RequestMapping(path="/fizzBuzzResult", method=RequestMethod.POST)
	public String displayfizzBuzzOutput(@ModelAttribute FizzBuzz theFizz, ModelMap modelHolder){
		modelHolder.put("theFizz", theFizz);
		
		return "fizzBuzzResult";
	}
}
