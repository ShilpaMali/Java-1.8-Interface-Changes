package com.Default.method.overrides;

//can we override default method ? yes we can

public interface Example {
	
	public default void x1() {
		System.out.println("This is default method..");
	}

}
