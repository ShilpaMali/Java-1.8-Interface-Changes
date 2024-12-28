package com.Default.method.calling;

public class DemoImpl implements Demo {
	public void get() {
		//Demo.x2();
		Demo.super.x2();  //using interfacename.super.methodname
	}

	public static void main(String[] args) {
		DemoImpl demoImpl = new DemoImpl();
		demoImpl.get();
	}

}
