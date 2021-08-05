package calc;

import java.util.Random;

public class Arithmetic {
	public static float add(float num1, float num2) {
		return num1 + num2;
	}

	public static float subtract(float num1, float num2) {
		return num1 - num2;
	}

	public static float multiply(float num1, float num2) {
		return num1 * num2;
	}

	public static float divide(float num1, float num2) {
		if (num2 != 0) {
			return num1 / num2;
		} else {
			System.out.println("num2 cannot be equal to zero");
			return 0;
		}
	}

	public static float square(float num1) {
		return num1 * num1;
	}

	public static float cube(float num1) {
		return num1 * num1 * num1;
	}

	public static float power(float num1, float num2) {
		return (float) Math.pow(num1, num2);
	}

	public static float mod(float num1, float num2) {
		if (num2 != 0) {
			return num1 % num2;
		} else {
			System.out.println("num2 cannot be equal to zero");
			return 0;
		}
	}

	public static float random(float num1, float num2) {
		Random rand = new Random();

		float low = num1;
		float high = num2;

		if (num1 > num2) {
			high = num1;
			low = num2;
		}

		return (rand.nextInt((int) (high - low)) + low);
	}
}