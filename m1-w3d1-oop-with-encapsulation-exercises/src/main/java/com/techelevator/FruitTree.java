package com.techelevator;

public class FruitTree {
	private String typeOfFruit = "";
	private int piecesOfFruitLeft;
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit){
		this.piecesOfFruitLeft = startingPiecesOfFruit;
		this.typeOfFruit = typeOfFruit;
		
		
	}
	
	public boolean pickFruit(int numberOfPiecesToRemove){
		if(piecesOfFruitLeft == 0){
			return false;
		}else{
			piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
			return true;
			
		}
	}
	
	
	
	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}







}
