package com.revature.threads;

/*
 * The Singleton design pattern is a design pattern which guarantees that there will only ever be a single instance of a class.
 * 
 * So how would we guarantee this?
 */

public class Singleton {

	/*
	 * "static" is a keyword which denotes that a member of the class belongs to the class rather to any instance. 
	 * This means that a new copy of this field will NOT be created with each instance of the Singleton class.
	 * 
	 * Something that is static must exist from the minute the application begins running.
	 * 
	 * NOTE: You can have static methods and fields and blocks.
	 * 
	 * Please do not use the "this" keyword to refer to a static member of the class as doing so implies that it belongs to any one instance.
	 */
	
	private static Singleton singleton;
	private static int instancesCreated;
	
	// As an aside, this is called a "static initializer". Please note that it is not traditionally used in a Singleton
	static {
		
	}
	
	
	private Singleton() {
	
		instancesCreated++;
		System.out.println(instancesCreated);
	}
	/*
	 * If you have a static block of code, you cannot access instance fields inside of those blocks.
	 * 
	 * NOTE: A synchronized resource is one that can only be accessed by one thread at a time. 
	 * A synchronized is locked until the thread that is currently accessing it is done with the resource.
	 * 
	 * Please also note that this is why we say that thread-safe implementations are slower.
	 */
	public static synchronized Singleton getInstance() {
		
		/*
		 * We need to make sure that we create a working instance of the Singleton, but only if one doesn't exist.
		 */
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
}
