package by.epam.unit01.main;

public class Task05 {

	public static void main(String[] args) {
		int a, b, c, d, sum;
		a = 1 + (int)(Math.random() * 100);
		b = 1 + (int)(Math.random() * 100);
		c = 1 + (int)(Math.random() * 100);
		d = 1 + (int)(Math.random() * 100);
        sum = a + b + c + d;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        System.out.println("sum = " + sum);
	}
}
