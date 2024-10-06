package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.item7;

import java.util.ArrayList;
import java.util.List;

public class HeapUtility {
    public String AnInstanceVariable = new String("******************************************");
    @Override
    public void finalize()
    {
        System.out.println("***********************Çöpler temizlendi.***********");
    }

    public static void OutOfMemoryErrorCreator(){
        List<HeapUtility> list = new ArrayList<>();
        while(true) {
            list.add(new HeapUtility());
        }
    }

    public static void heapLoader(int loopCount){
        List<HeapUtility> list = new ArrayList<>();

        while(loopCount>0) {
            heapPrinter();
            list.add(new HeapUtility());
            if(list.size()>1000){
                list=null;
                list = new ArrayList<>();
            }
            loopCount--;

        }
    }
    public static void heapPrinter() {
        int MB = 1024 * 1024;

        //Getting the runtime reference from system
        Runtime runtime = Runtime.getRuntime();

        System.out.println("Used Memory:"
                + (runtime.totalMemory() - runtime.freeMemory()) / MB);

        System.out.println("Free Memory:"
                + runtime.freeMemory() / MB);

        System.out.println("Total Memory:" + runtime.totalMemory() / MB);

        System.out.println("Max Memory:" + runtime.maxMemory() / MB);
    }
}
