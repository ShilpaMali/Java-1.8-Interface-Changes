package com.Default.method.overrides;

public class ExampleImpl implements Example {

	@Override
	public void x1() {
		System.out.println("This is overrided x1() method");
	}
	public static void main(String[] args) {

		// How to call x1() method
		ExampleImpl exampleImpl = new ExampleImpl();
		exampleImpl.x1(); //calling method
	}


}
