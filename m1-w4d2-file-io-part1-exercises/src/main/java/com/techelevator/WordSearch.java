package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
	
//Scanner for the word the User looks up.
	Scanner inputWord = new Scanner(System.in);
	System.out.println("What word would you like to search(no periods)? ");
	String wordToLookUp = inputWord.nextLine();

//Scanner to see if word needs to be case sensitive.
	Scanner caseSense = new Scanner(System.in);
	System.out.println("Do you want us case sensitivity ((T)rue or (F)alse)?");
	String caseSensitive = caseSense.nextLine();
//using a While loop to see if User inputted T or F. If not, it will continue to output the question.
	while(! (caseSensitive.toUpperCase().equals("T")) && ! (caseSensitive.toUpperCase().equals("F"))){
		System.out.println("Do you want use case sensitivity ((T)rue or (F)alse)?");
		caseSensitive = caseSense.nextLine();
	}
	
//Scanner for File Location
	Scanner inputLocation = new Scanner(System.in);
	System.out.println("What is the file location? ");
	String fileLocation = inputLocation.nextLine();
//Declaration of File location	
	File userStory = new File(fileLocation);
	
	
//Scanner to scan thru the text from file location that is given.	
	Scanner userScanner = new Scanner(userStory);
//for loop to see if "userScanner" which is scanner of the book.
		for(int i = 1; userScanner.hasNextLine(); i++){
			String lineString = userScanner.nextLine();
			//System.out.println(wordToLookUp);
//checking to see if its case sensitive.
			if(caseSensitive.toUpperCase().equals("T")){
//Seeing if lineString (the file) contains the user's word.
				if(lineString.contains(wordToLookUp)){
				System.out.println(i + ")" + " " + lineString);
				}	
				else{
					System.out.println("Nope, not in here!");
					
				}
			}
			else if(caseSensitive.toUpperCase().equals("F")){
				if(lineString.toLowerCase().contains(wordToLookUp.toLowerCase())){
					System.out.println(i + ")" + " " + lineString);
					}	
				else{
					System.out.println("Nope, not in here!");
					
				}
			}
			
		}
	}
}
	


