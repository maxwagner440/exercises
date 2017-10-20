package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ColorController {

	@RequestMapping( "/colorizedNameInput")
	public String displayColorInput() {
		
		return "colorizedNameInput";
	}
	
	
	@RequestMapping("/colorizedResult")
	public String displyaColoredResult(
		@RequestParam String first,
		@RequestParam String last,
		@RequestParam (required=false) String color ,
		ModelMap modelHolder){
		if(color != null){
		NameColor nameColored = new NameColor(first, last, color);
		modelHolder.put("nameColored", nameColored);
		}
		else{
			NameColor nameNotColored = new NameColor(first, last);
			modelHolder.put("nameColored", nameNotColored);
		}
		
		return "colorizedResult";
	}
}
