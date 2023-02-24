
public class Main {

	public static void main(String[] args) {
		int a = 220;
		int b = 284;
		int total1 = 0;
		int total2 = 0;
		for (int k = 1; k < a; k++) {
			if (a % k == 0) {
				total1 = total1 + k;
			}
		}
		for (int k = 1; k < b; k++) {
			if (b % k == 0) {
				total2 = total2 + k;
			}

		}
		System.out.println(total1);
		System.out.println(total2);
		if (total1 == b && total2 == a) {
			System.out.println(a + " ve " + b + " arkadaş sayıdır.");
		} else {
			System.out.println(a + " ve " + b + " arkadaş sayı değildir.");
		}
	}
}
