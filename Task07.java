package by.epam.unit01.main;

public class Task07 {

	public static void main(String[] args) {
		double a, b, c, d, result1, result2;
		a = 1 + (int)(Math.random() * 10);
		b = 1 + (int)(Math.random() * 10);
		c = 1 + (int)(Math.random() * 10);
		d = 1 + (int)(Math.random() * 10);
        result1 = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + b;
        result2 = a / c * (b / d) - (a * b - c) / (c * d);
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
	}
}
