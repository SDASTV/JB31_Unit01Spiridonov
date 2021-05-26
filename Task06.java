package by.epam.unit01.main;

public class Task06 {

	public static void main(String[] args) {
		int a, b, c, result;
		a = 1 + (int)(Math.random() * 100);
		b = 1 + (int)(Math.random() * 100);
		c = 1 + (int)(Math.random() * 100);
        result = (int)(Math.pow(a, 2) - Math.pow(b - c, 2));
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("result = " + result);
	}
}
