
public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";

		System.out.println(mesaj);

		System.out.println("Eleman sayısı :" + mesaj.length());
		System.out.println("5. eleman :" + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));     // birleştirme
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("B"));         // b ile başlıyor mu? evet ise true değilse false
		System.out.println(mesaj.endsWith("."));           // . ile bitiyor mu ? true. java case sensitive bir dildir.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);              // karakterleri al 0'dan 5'e kadar karakterler'e aktar 0'dan başlayıp.
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));           // a harfinin kaçıncı indexte olduğunu göster.
		System.out.println(mesaj.lastIndexOf("e"));        // sondan başlayarak bakar normal indexini verir.
	

	}

}
