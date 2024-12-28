package com.velocity.Default.method.why;

public interface Test {
	public abstract void getData(); // public abstract method by default

	// public abstract void getTest(); //adding new method here

	public default void getTest() {
		System.out.println("This is default method");
	}

}
