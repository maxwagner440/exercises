package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KataRomanNumerals {
	
	public String numtoRomanNum(int num){
		
		Map<Integer, String> romanNumeralMap = new HashMap<>();
		romanNumeralMap.put(1, "I");
		romanNumeralMap.put(5, "V");
		romanNumeralMap.put(10, "X");
		romanNumeralMap.put(50, "L");
		romanNumeralMap.put(100, "C");
		romanNumeralMap.put(500, "D");
		romanNumeralMap.put(1000, "M");
		
		List<Integer> numsBeforeConversion = new ArrayList<>();
		numsBeforeConversion.add(1000);
		numsBeforeConversion.add(500);
		numsBeforeConversion.add(100);
		numsBeforeConversion.add(50);
		numsBeforeConversion.add(10);
		numsBeforeConversion.add(5);
		numsBeforeConversion.add(1);
		
		List<Integer> numsCollect = new ArrayList<>();
		
		for(int i = 0 ; i < numsBeforeConversion.size(); i++){
			if(num < numsBeforeConversion.get(i)){
			}
			else{
				numsCollect.add(numsBeforeConversion.get(i));
				
			}
		}
		
		
		
		return result;
	}
}
