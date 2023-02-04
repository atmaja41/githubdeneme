
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
//While
		int i = 2;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("Do-While Döngüsü Bitti");
//Do-While
		int j = 2;      // kod satır satır ilerlediği için şartı sağlamasa bile bir kere
					    // çalışır.Şart sağlandığında normal while gibi çalışır.
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);

	}

}
