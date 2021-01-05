package com.app.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		// Get Class Object
		
		// Get Class using reflection
		Class<?> concreteClass = ConcreteClass.class;
		concreteClass = new ConcreteClass(5).getClass();
		
		try {
			// below method is used most of the times in frameworks like JUnit
			// Spring dependency injection, Tomcat web container
			// Eclipse auto completion of method ames, hibernate, Struts2, etc.
			// because ConcreteClass is not available at compile time
			concreteClass = Class.forName("com.app.reflection.ConcreteClass");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// prints: com.app.reflection.ConcreteClass
		System.out.println(concreteClass.getCanonicalName());
		
		// for primitive types, wrapper classes and arrays
		
		// prints: boolean
		Class<?> booleanClass = boolean.class;
		System.out.println(booleanClass.getCanonicalName());
		
		// prints: double
		Class<?> cDouble = Double.TYPE;
		System.out.println(cDouble.getCanonicalName());
		
		//prints: double[]
		Class<?> cDoubleArray;
		try {
			cDoubleArray = Class.forName("[D");
			System.out.println(cDoubleArray.getCanonicalName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// prints: java.lang.String[][]
		Class<?> twoDStringArray = String[][].class;
		System.out.println(twoDStringArray.getCanonicalName());

		
		// Get Super Class
		try {
			Class<?> superClass = Class.forName("com.app.reflection.ConcreteClass").getSuperclass();
			
			// prints: class com.app.reflection.BaseClass
			System.out.println(superClass);
			
			// prints: null
			System.out.println(Object.class.getSuperclass());
			
			// prints: class java.lang.Object
			System.out.println(String[][].class.getSuperclass());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Get Public Member Class
		Class<?>[] classes = concreteClass.getClasses();
		System.out.println(Arrays.toString(classes));
		
		// Get Declared Classes
		// Getting all of the classes, interfaces, and enums that are explicitly declared in ConcreteClass
		try {
			Class<?>[] explicitClasses = Class.forName("com.app.reflection.ConcreteClass").getDeclaredClasses();
			
			System.out.println(Arrays.toString(explicitClasses));
			
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Get Declaring Class
		// getDeclaringClass() method returns the Class object representing the class in which it was declared.
		try {
			Class<?> innerClass = Class.forName("com.app.reflection.ConcreteClass$ConcreateClassDefaultClass");
			
			System.out.println(innerClass.getDeclaringClass().getCanonicalName());
			System.out.println(innerClass.getEnclosingClass().getCanonicalName());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Getting Package Name
		// getPackage() method returns the package for this class. 
		// The class loader of this class is used to find the package.
		// We can invoke getName() method of Package to get the name of the package
		try {
			System.out.println(Class.forName("com.app.reflection.BaseInterface").getPackage().getName());
			// Personal Note: Seems unnecessary to get the package name (com.app.reflection) if you already state it in the forName() method
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Get Class Modifiers
		// getModifiers() method returns the int representation of the class modifiers, we can use
		// java.lang.reflect.Modifier.toString() method to get it in the string format as used in source code.
		
		// prints: "public"
		System.out.println(Modifier.toString(concreteClass.getModifiers()));
		
		// prints: "public abstract interface"
		try {
			System.out.println(Modifier.toString(Class.forName("com.app.reflection.BaseInterface").getModifiers()));
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Get Type Parameters
		// getTypeParameters() returns the array of TypeVariable if there are any Type parameters associated with the class.
		// The type parameters are returned in the same order as declared.
		
		// Get Type parameters (generics)
		try {
			TypeVariable<?>[] typeParameters = Class.forName("java.util.HashMap").getTypeParameters();
			for (TypeVariable<?> t : typeParameters) {
				System.out.println(t.getName() + ",");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Get Implemented Interfaces
		// getGenericInterfaces() method returns the array of interfaces implemented by the class with generic type information.
		// We can also use getInterfaces() to get the class representation of all the implemented interfaces
		
		try {
			Type[] interfaces = Class.forName("java.util.HashMap").getGenericInterfaces();
			
			System.out.println(Arrays.toString(interfaces));
			System.out.println(Arrays.toString(Class.forName("java.util.HashMap").getInterfaces()));
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Get All Public Methods
		// getMethods() method returns the array of public methods of the Class including public methods of it's superclasses and super interfaces.
		
		try {
			
			Method[] publicMethods = Class.forName("com.app.reflection.ConcreteClass").getMethods();
			
			// prints public methods of ConcreteClass, BaseClass, Object
			System.out.println(Arrays.toString(publicMethods));
			
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Get All Public Constructors
		// getConstructors() method returns the list of public constructors of the class reference of object
		
		try {
			Constructor<?>[] publicConstructors = Class.forName("com.app.reflection.ConcreteClass").getConstructors();
			
			System.out.println(Arrays.toString(publicConstructors));
			
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Get All Public Fields
		// getFields() method returns the array of public fields of the class including public fields of it's super classes and super interfaces
		
		try {
			Field[] publicFields = Class.forName("com.app.reflection.ConcreteClass").getFields();
			
			System.out.println(Arrays.toString(publicFields));
			
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Get All Annotations
		// getAnnotations() method returns all the annotations for the element, we can use it with class, fields, and methods also
		
		try {
			java.lang.annotation.Annotation[] annotations = Class.forName("com.app.reflection.ConcreteClass").getAnnotations();
			
			System.out.println(Arrays.toString(annotations));
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Get Public Field
		
		// Field Declaring Class
		// We can use getDeclaringClass() of field object to get the class declaring the field
		try {
			Field field = Class.forName("com.app.reflection.ConcreteClass").getField("interfaceInt");
			Class<?> fieldClass = field.getDeclaringClass();			
			System.out.println(field);
			
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Get Field Type
		// getType() method returns the Class object for teh declared field type, if field is primitive type, it returns the wrapper class object
		
		
		try {
			Field field = Class.forName("com.app.reflection.ConcreteClass").getField("publicInt");
			Class<?> fieldType = field.getType();
			System.out.println(fieldType.getCanonicalName());
			
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Get/Set Public Field Value
		// We can get and set the value of a field in an Object using reflection
		
		try {
			Field field = Class.forName("com.app.reflection.ConcreteClass").getField("publicInt");
			ConcreteClass obj = new ConcreteClass(5);
			System.out.println(field.get(obj));
			field.setInt(obj, 10);
			System.out.println(field.get(obj));
			
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Get/Set Private Field Value
		// We know that private fields and methods can't be accessible outside of the class but using reflection we can get/set the private field
		// value by turning off the java access check for field modifiers
		
		try {
			Field privateField = Class.forName("com.app.reflection.ConcreteClass").getDeclaredField("privateString");
			
			// Turning off access check with below method call
			privateField.setAccessible(true);
			ConcreteClass objTest = new ConcreteClass(1);
			System.out.println(privateField.get(objTest));
			privateField.set(objTest, "private string updated");
			System.out.println(privateField.get(objTest));
			
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Java Reflection for Methods
		
		// Get Public Method
		// We can use getMethod() to get a public method of class, we need to pass the method name and parameter type of the method.
		// If the method is not found in teh class, reflection API looks for the method in superclass.
		
		try {
			Method method = Class.forName("java.util.HashMap").getMethod("put", Object.class, Object.class);
			
			// get method parameter types, prints: "[class.java.lang.Object, class java.lang.Object]"
			System.out.println(Arrays.toString(method.getParameterTypes()));
			
			// get method return type, return "class java.lang.Object", class reference for void
			System.out.println(method.getReturnType());
			
			// get method modifiers
			System.out.println(Modifier.toString(method.getModifiers()));
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// Invoking Public Methods
		// We can use invoke() method of Method object to invoke a method.
		// If the method is static we can pass NULL as object argument
		
		try {
			Method method = Class.forName("java.util.HashMap").getMethod("put", Object.class, Object.class);
			
			Map<String, String> hm = new HashMap<>();
			method.invoke(hm, "key", "value");
			
			// Prints: {key=value}
			System.out.println(hm);
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Invoking Private Methods
		// We can use getDeclaredMethod() to get the private method and then turn off the access check to invoke it.
		
		try {
			Method method = Class.forName("com.app.reflection.BaseClass").getDeclaredMethod("method3", null);
			
			method.setAccessible(true);
			
			// Prints "Method3"
			method.invoke(null, null);
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Java Reflection for Constructors
		// Reflection API provides methods to get the constructors of a class to analyze and we can create new instances of a class by invoking the constructor
		
		// Get Public Constructor
		// We can use getConstructor() method on the class representation of object to get specific public constructor
		
		try {
			Constructor <?> constructor = Class.forName("com.app.reflection.ConcreteClass").getConstructor(int.class);
			
			// getting constructor parameters
			System.out.println(Arrays.toString(constructor.getParameterTypes()));
			
			Constructor<?> hashMapConstructor = Class.forName("java.util.HashMap").getConstructor(null);
			System.out.println(Arrays.toString(hashMapConstructor.getParameterTypes()));
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Instance Object using Constructor
		// We can use newInstance() method on the constructor object to instantiate a new instance of the class.
		// Since we use reflection when we don't have the classes information at compile time, we can assign it to Object and then further use reflection
		// to access it's fields and invoke it's methods.
		
		try {
			Constructor<?> constructor = Class.forName("com.app.reflection.ConcreteClass").getConstructor(int.class);
			// getting constructor parameters
			System.out.println(Arrays.toString(constructor.getParameterTypes()));
			
			Object myObj = constructor.newInstance(10);
			Method myObjMethod = myObj.getClass().getMethod("method1", null);
			myObjMethod.invoke(myObj, null);
			
			Constructor<?> hashMapConstructor = Class.forName("java.util.HashMap").getConstructor(null);
			System.out.println(Arrays.toString(hashMapConstructor.getParameterTypes()));
			HashMap<String, String> myMap = (HashMap<String, String>) hashMapConstructor.newInstance(null);
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
