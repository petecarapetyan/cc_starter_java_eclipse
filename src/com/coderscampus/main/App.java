package com.coderscampus.main;

public class App {
	public static final String EXAMPLE_CONSTANT = "String constants like this EXAMPLE_CONSTANT\n"
			+ " and like an app's `public static void main()` methods, are hopefully the only place\n"
			+ " you will code with `static` in this entire bootcamp,\n"
			+ " perhaps even in your entire career. ";
	
	private MyService myService = new MyService();
	
	public static void main(String[] args) {
		new App().execute();
	}

	private void execute() {
		// Your code goes here, not in the main() method
		// This removes any need to consume statics
		// The code below is to be deleted
		
		System.out.println(EXAMPLE_CONSTANT);
		System.out.println(" 2 * 17 = " + myService.multiply(2, 17));
	}

}
