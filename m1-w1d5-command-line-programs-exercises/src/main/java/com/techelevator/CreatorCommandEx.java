package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CreatorCommandEx {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This is the INSULT machine");
		System.out.println("Who are we insulting?");
		
		String theInsultee = input.nextLine();
		
		System.out.println("Pick a number: ");
		
		int theNumberinList = input.nextInt();
		
		System.out.println("Why the fuck did you pick a number you dumbass? IT'S RANDOM BITCH!");
		
		List<String> insultString = new ArrayList<>();

		insultString.add(" an Idiot");
		insultString.add(" a Moron");
		insultString.add(" a Blunderbus");
		insultString.add(" a Tall Awkward Fella");
		insultString.add(" a Cunt-Smith");
		insultString.add(" a Cotton-headed Ninny-muggens");
		insultString.add(" a Fart-Saving Carpet-Store Motherfucker");
		insultString.add(" a Jerry");
		insultString.add(" a Glipglop");
		insultString.add(" a Gaping Wide Vagine");
		insultString.add(" a Morty");
		insultString.add(" a Knife-Nipple Bastard");
		insultString.add(" a Douche");
		insultString.add(" a Dick Sucker");
		insultString.add(" a Fuck Stick");
		
		int length = insultString.size();
		
		int random = (int) (Math.random() * length);
		
		
		System.out.println("But anyways.... " + theInsultee.toUpperCase() + " is " + insultString.get(random) + "."); 
	}

}
