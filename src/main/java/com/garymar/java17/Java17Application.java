package com.garymar.java17;

import java.util.function.Function;


sealed interface Shape permits Circle, Rectangle {
	default void identify(){
		System.out.println("I am a " + getClass().getName());
	}
}

sealed interface Rectangle extends Shape permits Square {}

final class Circle implements Shape{

}

final class Square implements Rectangle {

}

public class Java17Application {

	public static void main(String[] args) {
		var i = 2; //int i = 2;

		Function<String, Integer> myLambdaFunction = s -> 2;

		var strings = """
				select * from DSM_PRODUCT_DEFINITION
					where ID = ?
				""";

		record Customer (Integer id, String name) {

		}

		var c = new Customer(2, "Josh");
		System.out.println("the name is " + c.id());


		var shapeObject = (Object) new Square();

		if(shapeObject instanceof Shape shape) {
			shape.identify();
		}

		int number = 42;

		int newNumber = switch(number) {
			case 10 -> 1;
			default -> 0;
		};



	}

}
