package com.learning.concepts.java.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationMain {

	public static void main(String[] args) {
		System.out.println("testing ...");
		
		Class<DemoAnnotation> obj = DemoAnnotation.class;
		
		for(Method m : obj.getDeclaredMethods()) {
			
			Annotation annotation = m.getAnnotation(Test.class);
			Test test = (Test)annotation;
			
			
				if(test.enabled()){
					try{
						m.invoke(obj.newInstance());
						System.out.println("TEst passed: "+m.getName() );
					}catch(Throwable ex) {
						System.out.println("TEst failed: "+ m.getName()+" "+ex.getCause() );
						System.out.println("Exception thrown");
					}
				}else{
					System.out.println("test ignored: "+m.getName());
				}
			
		}
		
		
	}

}
