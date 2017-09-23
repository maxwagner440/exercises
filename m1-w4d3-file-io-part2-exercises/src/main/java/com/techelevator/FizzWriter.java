package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		
		File threeHundred = new File("FizzBuzz.txt");
		try(PrintWriter write300 = new PrintWriter(threeHundred)){
			for(int i = 1; i < 301; i++){
				if(( i %15 == 0 )|| (i % 15 == 0 && Integer.toString(i).contains("3")) || (i % 15 == 0 && Integer.toString(i).contains("5"))){
					write300.println("FizzBuzz");
				}
				else if(i % 3 == 0){
					write300.println("Fizz");
				}
				else if(i % 5 == 0){
					write300.println("Buzz");
				}
				else if(Integer.toString(i).contains("5")){
					write300.println("Buzz");
				}
				else if(Integer.toString(i).contains("3")){
					write300.println("Fizz");
				}else{
					write300.println(i);
				}
			}
			
		} catch (FileNotFoundException ex) {
		
			System.out.println("No File Created");
			System.exit(1);
		}
		
		
	}

}
