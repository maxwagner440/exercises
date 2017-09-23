package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the file path? ");
		String location = input.nextLine();
		System.out.println("How many lines do you want to split on? ");
		int lineSplitNum = input.nextInt();
		
		splitFile(location, lineSplitNum);
			
		}

	public static void splitFile(String fileName, int maxLines){
		File actualLocation = new File(fileName);
		File newLocation = new File ("input.txt");
		try(Scanner readDoc = new Scanner(actualLocation); PrintWriter writeDoc = new PrintWriter(newLocation)){
			while(readDoc.hasNextLine()){
				for(int i = 0; i < maxLines; i++){
				String[] readDocString = new String[maxLines];
				readDocString[i]= readDoc.nextLine();
				writeDoc.println(readDocString[i]);
				}
			}
			
		} catch (FileNotFoundException e) {
		
			System.out.println("File Was Not Found");
			System.exit(1);
		}
	}

}
