package com.kurtulussahin.java.problems.vowelremover;

public class VowelRemover {
	public static String removeVowels(String s) {
		String vowels = "aeiouAEIOU";
		
		String strRes="";
		for(int i=0; i<s.length(); i++){
			boolean isVowel=false;
			for(int j=0; j<vowels.length(); j++){
				if(s.charAt(i)==vowels.charAt(j))
					isVowel=true;
			}
			if(!isVowel){
			strRes=strRes+s.charAt(i);
			}
			
		}
		return strRes;
	}
}
