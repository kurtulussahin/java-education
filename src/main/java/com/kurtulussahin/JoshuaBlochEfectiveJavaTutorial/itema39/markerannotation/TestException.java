package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema39.markerannotation;

//Annotation type with a parameter (Page 183)

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated method is a test method that must throw the
 * designated exception to succeed.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestException {
	Class<? extends Throwable> value();
}