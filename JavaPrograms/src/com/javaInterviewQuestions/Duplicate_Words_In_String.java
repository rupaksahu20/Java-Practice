package com.javaInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate_Words_In_String {
	
	
	//Hey java is java best language is java
	//java:3
	//is:2
	
	public static void main(String[] args) {
		findDupliacteWords("Hey java is java best language is java");
		findDupliacteWords("Rupak is coming to home after that Rupak will go to Gym");
		findDupliacteWords("Hey python  is not java but best language is Java not python");
		findDupliacteWords("100 200 300 100 100 400 200");
		
	}
	
	
	
	public static void findDupliacteWords(String inputString) {
		//split
		String[] words=inputString.split(" ");
		
		//create one HashMap:
		Map<String ,Integer> wordcount=new HashMap<String ,Integer>();
		
		//to check Each word in given Array
		for(String word:words) {
			
			//if word is present:
			if(wordcount.containsKey(word)) {
				wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
			}
				else {
					wordcount.put(word, 1);
				}
				
			}
		
		//Extracting all the keys of map=wordcount:
		Set<String> wordInString=wordcount.keySet();
		
		//loop through all the word in wordcount:
		 
		for(String word:wordInString) {
			if(wordcount.get(word)>1) {
				System.out.println(word + " : " + wordcount.get(word));
			}
		}
		
		
		}
		
		
		
	}


