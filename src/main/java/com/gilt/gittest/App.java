package com.gilt.gittest;

/**
 * Hello world!
 * 
 */
public class App {
	
	private final String message;
	public App() {
		this("Hello World!");
	}
	
	public App(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return message;
	}

	public static void main(String[] args) {
		System.out.println(new App());
	}
}
