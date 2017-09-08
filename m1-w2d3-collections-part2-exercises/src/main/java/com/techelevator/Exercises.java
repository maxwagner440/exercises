package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Exercises {

	/*
	 * Dictionary/Map Exercises
	 */
	
	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").  
	 * 
	 * The animal name should be case insensitive so "elephant", "Elephant", and 
	 * "ELEPHANT" should all return "herd". 
	 * 
	 * If the name of the animal is not found, null, or empty, return "unknown". 
	 * 
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * 
	 */
	public String animalGroupName(String animalName) {
		Map<String, String> theAName = new HashMap<>();
			theAName.put("rhino", "Crash");
			theAName.put("giraffe", "Tower");
			theAName.put("elephant", "Herd");
			theAName.put("lion", "Pride");
			theAName.put("crow", "Murder");
			theAName.put("pigeon", "Kit");
			theAName.put("flamingo", "Pat");
			theAName.put("deer", "Herd");
			theAName.put("dog", "Pack");
			theAName.put("crocodile", "Float");
	
			if(theAName.get(animalName.toLowerCase()) == null){
			return "unknown";
			}
			else{
				return theAName.get(animalName.toLowerCase());
		}
	
	}

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 * 
	 * If the item number is empty or null, return 0.00.
	 * 
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 * 
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *  
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00 
	 * 
	 */
	public Double isItOnSale(String itemNumber) {
		double salePercent = 0.00;
		Map<String, Double> skuList = new HashMap<>();
			skuList.put("KITCHEN4001", 0.20);
			skuList.put("GARAGE1070", 0.15);
			skuList.put("LIVINGROOM", 0.10);
			skuList.put("KITCHEN6073", 0.40);
			skuList.put("BEDROOM3434", 0.60);
			skuList.put("BATH0073", 0.15);
			
		if(skuList.get(itemNumber) == null){
			return 0.00;
		}else
			
			return skuList.get(itemNumber);
		
	}
	
	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 * 
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 * 
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 * 
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		//figure out Peter's money
		//figure out Paul's money
//1. get variable out of map		
		int petersMoney = peterPaul.get("Peter");
		int paulsMoney = peterPaul.get("Paul");
//2. condition		
		//if Paul has less than 1000 and more than 0
		
		if(paulsMoney < 1000 && petersMoney > 0){
			
			int stolenMoney = petersMoney / 2;
			paulsMoney += stolenMoney;
			petersMoney -= stolenMoney;
//3. puts back into map	
		}
		//take 1/2 of Peters money and give it to Paul
		peterPaul.put("Paul", paulsMoney);
		peterPaul.put("Peter", petersMoney);
		
		return peterPaul;
	}
	
    /*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 * 
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 * 
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		//if Peter has 5000 & Paul has 10000 then create new key point on current map (PeterPaulPartnership)
		int petersMoney = peterPaul.get("Peter");
		int peterNew = 0;
		int paulsMoney = peterPaul.get("Paul");
		int paulNew = 0;
		if(petersMoney >= 5000 && paulsMoney >= 10000){
			Integer newRelMon = ((petersMoney + paulsMoney ) /4);
			peterNew = (petersMoney *3/4);
			paulNew = (paulsMoney *3/4);
			peterPaul.put("Peter", peterNew);
			peterPaul.put("Paul", paulNew);
			peterPaul.put("PeterPaulPartnership", newRelMon);
			
		}
		
		//PPP is 1/4 of both account amounts combined 
		//return a modifed peterPaulPartnership
		
		return peterPaul;
	}
	
	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array, 
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		return null;
	}
	
	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the 
	 * number of times that string appears in the array.
	 * 
	 * ** A CLASSIC **
	 * 
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 * 
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer> counts = new HashMap<>();
		for(String word : words){
			//if not in Map, put in map with count 1
			if(counts.containsKey(word)){
				int currentCount = counts.get(word);
				currentCount++;
				counts.put(word, currentCount); //overwrites what was there and puts incremented value back in.
			}else{
				counts.put(word, 1);
			}
			//if it is in Map, increment count
		}
		
		return counts;
		
	}
	
	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the 
	 * number of times that int appears in the array.
	 * 
	 * ** The lesser known cousin of the the classic wordCount **
	 * 
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 * 
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> withKey = new HashMap<>();
		//create int/int Map
		//first int is the value of the Array given. 
		//second int is the number of times that number exists in the Array. Need a counter
		int currentCount = 0;
		for(int i : ints){
			if(i <= 1){
				withKey.put(i, i);
			}else if(withKey.containsKey(i)){
				currentCount++;
				withKey.put(i, currentCount);
				
			}else{
				
			}
		}
		
		
		return withKey;
	}
	
	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 * 
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 * 
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		return null;
	}
	
	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2, 
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 * 
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *  
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 * 
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
		return null;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 * 
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears 
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1. 
	 * 
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.  
	 * 
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *  
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 * 
	 */
	public Map<String, Integer> last2Revisted(String[] words) {
		return null;
	}
}
