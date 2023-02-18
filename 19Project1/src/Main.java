
public class Main {

	public static void main(String[] args) {
		int sayı = 1;
		boolean asalMı = true;
		if (sayı == 1) {
			System.out.println("Sayı asal değildir.");
			return;
		}
		if (sayı < 1) {
			System.out.println("Geçersiz sayı");
		}

		for (int k = 2; k < sayı; k++) {
			if (sayı % k == 0) {
				asalMı = false;
			}

		}
		if (asalMı) {
			System.out.println("Asal.");
		} else {
			System.out.println("Asal değil.");
		}
	}
}
