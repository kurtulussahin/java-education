package com.kurtulussahin.java.temeller.ifelse;

public class IfElse {

	public static void main(String[] args) {

		
        int score = 80;
        
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {	
            grade = 'F';
        }
        System.out.println("Your grade is " + grade);
        
        if(grade < 'C')
        	System.out.println("👏👏👏");
        
        if(grade == 'A' | grade == 'B')
        	System.out.println("👏👏👏");
        
        if(grade == 'F')
        	System.out.println("😩");
	}

}
