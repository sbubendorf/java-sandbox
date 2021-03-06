package ch.rusi.sandbox.java8.defaultmethods;

/*
Java 8 enables us to add non-abstract method implementations to interfaces by utilizing the default keyword. 
This feature is also known as Extension Methods. Here is our first example 
*/

public interface Formula {
	
	double calculate(int a);
	
	default double sqrt(int a) {
		return Math.sqrt(a);
	}

}
