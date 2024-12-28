package com.Default.method.scenario4;

public class ExampleTest implements Example1, Example2 {
	public static void main(String[] args) {
		ExampleTest exampleTest = new ExampleTest();
		exampleTest.x3();
	}

	@Override
	public void x3() {
		Example1.super.x3();
		Example2.super.x3();
	}

}
