package com.kurtulussahin.problems.arithmeticops;

public class ArithmeticOps {
	public static int operate(int num1, int num2, String operator) {
		if (operator == "+") {
			return num1 + num2;
		}
		if (operator == "-") {
			return num1 - num2;
		}
		if (operator == "*") {
			return num1 * num2;
		}
		if (operator == "/") {
			return num1 / num2;
		}
		if (operator == "%") {
			return num1 % num2;
		}

		return 1;

	}

}
