package com.kurtulussahin.java.temeller.multithreding.deadlock;

public class Kitchen {

    public static Object spoon = new Object();
    public static Object bowl = new Object();

    public static void main(String args[]) {
        
        Thread cook1 = new Thread(() -> {
            synchronized (spoon) {
                System.out.println("Cook1: Holding the spoon...");
                System.out.println("Cook1: Waiting for the bowl...");
                for(int i=0; i<10000; i++){
                    //waiting to create a race condition
                }
                synchronized (bowl) {
                    System.out.println("Cook1: Holding the spoon and the bowl.");
                }
            }
        });
        
        Thread cook2 = new Thread(() -> {
            synchronized (bowl) {
                System.out.println("Cook2: Holding the bowl...");
                System.out.println("Cook2: Waiting for the spoon...");

                synchronized (spoon) {
                    System.out.println("Cook2: Holding the spoon and the bowl.");
                }
            }
        });
                
        cook1.start();
        cook2.start();
        
    }

}
