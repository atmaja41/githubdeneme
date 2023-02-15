
public class Main {
	public static void main(String[] args) {
		String mesaj = " Bugün hava çok güzel. ";
		System.out.println(mesaj);
		String yeniMesaj = mesaj.replace(' ', '-');  // değiştirme
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2));      // 2.indexten başla
		System.out.println(mesaj.substring(6, 16));  // 2.indexten başla 16.indexte kes.

		for (String kelime : mesaj.split(" ")) {     // ayırma boşluğa göre ayır.
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());     // küçük harfe çevir.
		System.out.println(mesaj.toUpperCase());     // büyük harfe çevir veri tabanına arama gönderdiğimizde
													 // kullanabiliriz.
		System.out.println(mesaj.trim());            // başında ve sonundaki boşlukları attı

	}

}
