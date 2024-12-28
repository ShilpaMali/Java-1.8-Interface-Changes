package com.velocity.statics.why;

public interface Test {
	public abstract void x1();

	// public abstract void x2();
	public static void x2() {
		System.out.println("This is static method");
	}

}
