package com.Default.method.scenario3;

public class ExampleTest implements Example1, Example2 {
	@Override
	public void x4() {
		Example2.super.x4();
	}

	@Override
	public void x3() {
		Example1.super.x3();
	}

	public static void main(String[] args) {
		ExampleTest exampleTest = new ExampleTest();
		exampleTest.x3();
		exampleTest.x4();
	}

}
