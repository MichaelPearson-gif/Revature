package com.revature.lambdas;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		/*
		 * A lambda expression allows us to pass around implementations as if they were objects.
		 * In order to use a lambda expression, you must declare the expression's type as that of a functional interface.
		 */
		
		Calculator addition = (x, y) -> x + y;
		Calculator subtraction = (x, y) -> x - y;
		Calculator multiplication = (int x, int y) -> x * y;
		Calculator division = (x, y) -> {return x/y;};
		
//		LambdaExpressions.doMath(7, 3, addition);
//		LambdaExpressions.doMath(5, 10, )
		
		

	}

}
