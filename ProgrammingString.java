package com.practise.alg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProgrammingString {

	public static String findFirstNonRepeatingChar(String input)
	{
		char[] temp = input.toCharArray();
		for(char c:temp){
			if(input.indexOf(c)==input.lastIndexOf(c)){
				return String.valueOf(c);
			}
		}

		return "No result";
	}
	public static String firstNonRepeatingChar(String word) {
		Set<Character> repeating = new HashSet<>();
		List<Character> nonRepeating = new ArrayList<>();
		for (int i = 0; i < word.length(); i++)
		{ char letter = word.charAt(i); 
		if (repeating.contains(letter))
		{ continue; } 
		if (nonRepeating.contains(letter)) {
			nonRepeating.remove((Character) letter); 
			repeating.add(letter); }
		else { nonRepeating.add(letter); } 
		
		} if(nonRepeating.isEmpty())return "Nothing";
		return nonRepeating.get(0).toString(); } 

	public static String firstNonRepeatingCharMyLogic(String word) {
		//Set<Character> repeating = new HashSet<>();
		List<Character> nonRepeating = new ArrayList<>();
		//char[] nonRepeating;
		for (int i = 0; i < word.length(); i++)
		{ char letter = word.charAt(i); 
		//if (repeating.contains(letter))
		//{ continue; } 
		if (nonRepeating.contains(letter)) {
			nonRepeating.remove((Character) letter); 
			}
		else { nonRepeating.add(letter); } 
		}
		if(nonRepeating.isEmpty())return "Nothing";
		return nonRepeating.get(0).toString();
		} 

	public static void main(String[] args) {
		System.out.println(ProgrammingString.firstNonRepeatingCharMyLogic("aaabbaaac"));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
