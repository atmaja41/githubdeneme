
public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Mustafa";
		String ogrenci2 = "Hakan";
		String ogrenci3 = "Ayşe";
		String ogrenci4 = "Aslı";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("--------------------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "MUSTAFA";
		ogrenciler[1] = "HAKAN";
		ogrenciler[2] = "AYŞE";
		ogrenciler[3] = "ASLI";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("--------------------------");
		for (String ogr : ogrenciler) {
			System.out.println(ogr);
		}

	}

}
