package com.kurtulussahin.java.temeller.switchcase;

public class SwitchCaseDemo {
    
    public static void main(String[] args) {
    	SwitchCaseDemo demo = new SwitchCaseDemo();
		
		demo.switchDemo1(1);
		demo.switchDemo2(12);
    }
    
    public void switchDemo1(int month) {

//		  final int i = 4;
//		  final int i = returnConstant(); // That does'nt work because it is not a constant expression
		
        switch (month) {
            case 1:  System.out.println("January"); break;
            case 2:  System.out.println("February"); break;
            case 3:  System.out.println("March"); break;
            case 4:  System.out.println("April"); break;
            case 5:  System.out.println("May"); break;
            case 6:  System.out.println("June"); break;
            case 7:  System.out.println("July"); break;
            case 8:  System.out.println("August"); break;
            case 9:  System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("Error! Please enter the month number between 1 and 12"); break;
        }
    }
       
    public void switchDemo2(int month) {
        switch (month) {
        case 12: 
        case 1:  
        case 2:  System.out.println("Winter"); break;
        
        case 3:  
        case 4:  
        case 5:  System.out.println("Spring"); break;
        
        case 6:  
        case 7:  
        case 8:  System.out.println("Summer"); break;
        
        case 9: 
        case 10:
        case 11: System.out.println("Fall"); break;
        
        default: System.out.println("Error! Please enter the month number between 1 and 12"); break;
        }
    }
        
}

