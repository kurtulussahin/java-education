package src.com.kurtulussahin.java.temeller.classinitialization.initializationorder;

/*
 *Başlatma Sırası:
 *
 *Sınıf değişkenleri (statik başlatma blokları dahil),
 *Nesne oluşturuluyorsa, her nesne için,
 *Nesne değişkenleri (nesne başlatma blokları dahil),
 *Kurucu çağrısı ve varsa this() ile yapılan tüm kurucu çağrıları.
 *Birden fazla sınıf ve nesne değişkeni varsa başlatma sırası, fiziksel sırayla belirlenir, önce gelen önce başlatılır.
 *Eğer üye değişkenler de nesne ise, onların da başlatılmaları gereklidir.
 *Bu şekilde başlatma bir sınıftan ve nesnesinden başlar ve kullanılan pek çok sınıfa ve nesnesine kadar ulaşır.
 *
 */

public class ClassInitialization {

    public static void main(String[] args) {
//		ClassA a; // Doesn't cause anything because no part of the ClassA is reached.
//
        System.out.println(ClassA.i);	// Causes the initialization of ClassA
//
//		ClassA.printInfo(); // Causes the initialization of ClassA

//		new ClassA(); // Causes the initialization of ClassA and then calls the constructor.
    }
}

class ClassA {
    static int i = 5;

    private static double d1;
    private static String name = "JAVA";

    static {
        System.out.println("i: " + i);
        System.out.println("Initial value of d1: " + d1);
        d1 = Math.random() * 10;
        System.out.println("And now the value of d1: " + d1);
    }

    public ClassA() {
        System.out.println("\nStarting ClassA()");
        System.out.println("The value of d1: " + d1);
        d1 = Math.random() * 10;
        System.out.println("And now the value of d1: " + d1);

        System.out.println("The value of d2: " + d2);
        d2 = Math.random() * 100;
        System.out.println("And now the value of d2: " + d2);
        System.out.println("Ending ClassA()");
    }

    static void printInfo() {
        System.out.println("\nInfo");
        System.out.println("i: " + i +  " d1: " + d1 +  " d2: " + d2);
    }

    private static double d2;

    static {
        System.out.println("Initial value of d2: " + d2);
        d2 = Math.random() * 100;
        System.out.println("And now the value of d2: " + d2);
    }

    public static String init() {
        System.out.println("in init()");
        return "55";
    }

}
