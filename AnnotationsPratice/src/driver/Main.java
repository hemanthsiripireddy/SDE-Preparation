package driver;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import annotations.Cat;
import annotations.Dog;
import annotations.ImportantString;
import annotations.RunImmediately;
import annotations.RunImmediatelyEx2;
import annotations.VeryImportant;

public class Main {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		// TODO Auto-generated method stub
		Cat cat=new Cat("Stella");
		if(cat.getClass().isAnnotationPresent(VeryImportant.class)) {
			System.out.println("This is very import");
		}else {
			System.out.println("This is not Very Important");
		}
		Dog dog=new Dog();
		if(dog.getClass().isAnnotationPresent(VeryImportant.class)) {
			System.out.println("This is very import");
		}else {
			System.out.println("This is not Very Important");
		}
			
		//method annotations
		for(Method method:cat.getClass().getDeclaredMethods()) {
			if(method.isAnnotationPresent(RunImmediately.class)) {
				method.invoke(cat);
			}
		}
		// annotations with parameters
		// we can also provide default value, if not provided, we are required to pass value using this annotation
		for(Method method:dog.getClass().getDeclaredMethods()) {
			if(method.isAnnotationPresent(RunImmediatelyEx2.class)) {
				RunImmediatelyEx2 an=method.getAnnotation(RunImmediatelyEx2.class);
					for(int i=0;i<an.times();i++) {
						method.invoke(dog);
					}
				
			}
		}
		//annotation for field
		for(Field field:cat.getClass().getDeclaredFields()) {
			if(field.isAnnotationPresent(ImportantString.class)) {
				
				Object object =field.get(cat);
				if(object instanceof String st) {
					System.out.println(st.toUpperCase());
				}
			}
		}
		

	}

}
