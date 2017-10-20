package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NameController {
	 

		@RequestMapping({"/", "/orderedName"})
		public String displayGreeting() {
			
			return "orderedName";
		}
		
		@RequestMapping("/xOrderedResult")
		public String presentNameInSpecificOrder(
				@RequestParam String firstName,
				@RequestParam(required=false) String middleName,
				@RequestParam String lastName,
				@RequestParam String order,
				ModelMap modelHolder){
			SpOrderName nameOrdered = new SpOrderName(firstName, middleName, lastName, order);
			modelHolder.put("nameOrdered", nameOrdered);
			return "xOrderedResult";
		}
		
		
}

