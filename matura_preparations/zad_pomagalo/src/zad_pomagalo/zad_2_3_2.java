package zad_pomagalo;

public class zad_2_3_2 {
	public static void main(String[] args) {
		double A = A(1, 3);
		double B = B(2, 3);
		double C = C(2,3);
		double D = D(5);
		System.out.println("A: 10 -> " + A);
		System.out.println("B: 3 and base: 2 -> " + B);
		System.out.println("C: 3 and base: 2 -> " + C);
		System.out.println("D: 5 -> " + D);
	}

	public static double A(int start, double number) {
		if (start == number) {
			return Math.sqrt(number);
		}
		return Math.sqrt(start + A(start + 1, number));
	}

	public static double B(int x, double number) {
		if (number == 0) {
			return 1;
		}
		return 1 / Math.pow(x, number) + B(x, number - 1);
	}

	public static double C(int x, double number) {
		if(number == 0) {
			return 1;
		}
		return Math.pow(x, number) + C(x,number - 1);
	}

	public static double D(double number) {
		if(number == 2) {
			return 2;
		}
		return ((number - 1) * number) + D(number - 1);
	}
}
