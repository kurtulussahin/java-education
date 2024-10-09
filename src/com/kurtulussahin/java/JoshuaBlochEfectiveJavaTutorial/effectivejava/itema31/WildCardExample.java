package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema31;

import java.util.ArrayList;
import java.util.List;

public class TestDrive {


    public static void main(String[] args) {

        List<Object> obje1 = new ArrayList<Object>();

        //Contravariant not supported
        //List<Object> obje2 = new ArrayList<String>();

        //Contravariant not supported
        //List<String> obje3 = new ArrayList<Object>();



		A a=new A();
		B b=new B();
		C c=new C();
		D d=new D();

		List<?> listwildCardNewA = new ArrayList<A>();
		List<?> listwildCardNewB = new ArrayList<B>();
		List<?> listwildCardNewC = new ArrayList<C>();
		List<?> listwildCardNewD = new ArrayList<D>();

		//Compile errror.
			//List<? extends B> listExtendsBNewA = new ArrayList<A>();
		List<? extends B> listExtendsBNewB = new ArrayList<B>();
		List<? extends B> listExtendsBNewC = new ArrayList<C>();
		List<? extends B> listExtendsBNewD = new ArrayList<D>();


		List<? super B> listSuperBNewA = new ArrayList<A>();
		List<? super B> listSuperBNewB = new ArrayList<B>();
		//Compile errror.
			//List<? super B> listSuperBNewC = new ArrayList<C>();
			//List<? super B> listSuperBNewD = new ArrayList<D>();



		//PECS - "Producer - Extends, Consumer - Super".

		//List<? super Parent>
			// Your List is a consumer of Parent objects.

		//List<? super Parent>
			// Your List is a producer of Parent objects.

		void WildCardExtends(List<? extends B> listExtendsB )

    }

}
