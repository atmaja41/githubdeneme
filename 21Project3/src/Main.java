
public class Main {

    public static void main(String[] args) {
// 6 --> 2,3 bölünebiliyor toplamları 6
//28 -->2,4,7,14 bölünebiliyor toplamları 28
        int number = 28;
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        //System.out.println(total);
        if (total == number) {
            System.out.println(number + " Mükemmel sayıdır");
        } else {
            System.out.println("Mükemmel sayı değildir.");
        }
    }

}
