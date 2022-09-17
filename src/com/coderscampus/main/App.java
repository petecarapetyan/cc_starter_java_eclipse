package com.coderscampus.main;

import com.coderscampus.services.MyService;

public class App {
	
	private MyService myService = new MyService();
	
	public static void main(String[] args) {
		new App().execute();
	}

	private void execute() {
		// Your code goes here, not in the main() method
		// This removes any need to consume statics
		// The code below is to be deleted

		System.out.println(MyConstants.EXAMPLE_CONSTANT);
		System.out.println(" 2 * 17 = " + myService.multiply(2, 17));
		System.out.println("Could have consumed a file at " + MyConstants.EXAMPLE_FILE_PATH);
	}

}
