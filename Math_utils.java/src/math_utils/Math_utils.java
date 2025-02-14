package math_utils;

public class Math_utils {

	public int add(int... numbers) {

		int sum = 0;

		for (int num : numbers) {

			sum += num;
		}
		return sum;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {

		return a * b;
	}

	public int divide(int a, int b) {
		
		if (b == 0) {
			
			throw new ArithmeticException("No se puede dividir por cero");
		}
		return a / b;
	}

}
