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
		return num1 / num2;
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
		return num1 % num2;
	}

	public static float random(float num1, float num2) {
		Random rand = new Random();

		float low = 0;
		float high = 0;

		if (num1 > num2) {
			high = num1;
			low = num2;
		} else {
			high = num2;
			low = num1;
		}

		return (rand.nextInt((int) (high - low)) + low);
	}
}