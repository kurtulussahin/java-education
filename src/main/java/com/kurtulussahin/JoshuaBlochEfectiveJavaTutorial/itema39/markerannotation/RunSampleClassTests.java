package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema39.markerannotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunSampleClassTests {
	
	public static void main(String[] args) throws Exception {
		int tests = 0;
		int passed = 0;
		Class<?> testClass = Class.forName("com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema39.markerannotation.SampleClassTest");
		for (Method m : testClass.getDeclaredMethods())
		{
			if (m.isAnnotationPresent(Test.class)   )
			{
				tests++;
				try 
				{
					m.invoke(null);
					passed++;
				} catch (InvocationTargetException wrappedExc) {
					Throwable exc = wrappedExc.getCause();
					System.out.println(m + " failed: " + exc);
				} catch (Exception exc) {
					System.out.println("Invalid @Test: " + m);
				}
			}
		}

		for (Method m : testClass.getDeclaredMethods())
		{
			if (m.isAnnotationPresent(TestException.class))
			{
				tests++;
				try
				{
					m.invoke(null);
					System.out.printf("Test %s failed: no exception%n", m);
				} catch (InvocationTargetException wrappedEx) {
					Throwable exc = wrappedEx.getCause();
					Class<? extends Throwable> excType = m.getAnnotation(TestException.class).value();
					if (excType.isInstance(exc))
					{
						passed++;
					}
					else
					{
						System.out.printf("Test %s failed: expected %s, got %s%n", m, excType.getName(), exc);
					}
				} catch (Exception exc) {
					System.out.println("Invalid @ExceptionTest: " + m);
				}
			}
		}

		System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
	}
	
}
