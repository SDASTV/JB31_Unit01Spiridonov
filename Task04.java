package by.epam.unit01.main;

public class Task04 {

	public static void main(String[] args) {
		int a, b;
		double c, s;
		a = 1 + (int)(Math.random() * 100);
		b = 1 + (int)(Math.random() * 100);
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        s = (double)(a * b) / 2;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
	}
}
