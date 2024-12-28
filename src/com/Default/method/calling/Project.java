package com.Default.method.calling;

public interface Project {
	public default void x2() {
		System.out.println("This is x2() method..");
	}

}
