package com.Default.method.scenario2;

public class ExampleImpl implements Example1, Example2 {
	public static void main(String[] args) {
		ExampleImpl exampleImpl = new ExampleImpl();
		exampleImpl.x3();
	}

	/*@Override
	public void x3() {
		// TODO Auto-generated method stub
		Example1.super.x3();
	}*/
	
	@Override
	public void x3() {
		// TODO Auto-generated method stub
		Example2.super.x3();
	}

}
