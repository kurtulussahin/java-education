package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema24;

public class NonStaticNested {
	
	private String sözcük = "Sözcük";
	
	public class NonStaticNestedClass
	{
		
		public void yazBunu()
		{
			System.out.println(sözcük);
		}
		
	}

}
