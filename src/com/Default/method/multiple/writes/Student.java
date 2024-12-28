package com.Default.method.multiple.writes;

//can we write multiple default method in single interface ? yes we can 

public interface Student {
	
	public default void getStudentInfo() {
		System.out.println("This is student info");
	}

	public default void getStudentAddressInfo() {
		System.out.println("This is student address info");
	}

}
