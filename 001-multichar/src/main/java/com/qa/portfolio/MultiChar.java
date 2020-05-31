package com.qa.portfolio;

public class MultiChar {

	private char[] answers;

	/**
	 * For each character in the entered string the method will triplicate
	 * each the character and return the concatenated string.
	 * 
	 * @param input - any string
	 
	 */
	
	
	
	public String multiChar(String input) {
		
		char Arr[]= new char[input.length()*3];
		
		int j = 0;
		for (int i=0; i<input.length(); i++) {
			
			int count = 0;
			while (count<3) {
				Arr[j]=input.charAt(i);
				count+=1;
				j+=1;
			}
			
			  
			   
	} 
		input = String.valueOf(Arr);
		return input;
}
}
