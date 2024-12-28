package com.Default.method.scenario1;

public class ExampleTest implements Example1, Example2 {

	@Override
	public void x3() {
		// TODO Auto-generated method stub
		Example1.super.x3();
	}
	public static void main(String[] args) {
		ExampleTest exampleTest = new ExampleTest();
		exampleTest.x3();
	}

}
