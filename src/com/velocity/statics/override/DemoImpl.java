package com.velocity.statics.override;

public class DemoImpl {
	
	/*@Override
	public static void getData() {
		System.out.println("This is static method...");
	}*/
	//we cant override static method
	public static void main(String[] args) {
		
		Demo.getData(); //interfacename.methodname
	}

}
