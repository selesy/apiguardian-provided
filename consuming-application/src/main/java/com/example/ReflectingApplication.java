/**
 * 
 */
package com.example;

import java.lang.annotation.Annotation;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author swm16
 *
 */
public class ReflectingApplication {

	static Consumer<Annotation> printCanonicalName = a -> {
		Class<? extends Annotation> annotationType = a.annotationType();
		System.out.println("Annotation canonical name: " + annotationType.getCanonicalName());
	};

	public static void main(String[] args) {
		(new AnnotatedLibrary()).sayHi();

		Stream.of(AnnotatedLibrary.class.getAnnotations()).forEach(printCanonicalName);
		
		// This is actually a compile-time error since
//		Annotation annotation1 = AnnotatedLibrary.class.getAnnotation(API.class);
//		Annotation annotation2 = AnnotatedLibrary.class.getAnnotation(SuppressWarnings.class);
	}

}
