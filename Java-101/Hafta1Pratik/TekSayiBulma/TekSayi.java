import java.util.Scanner;
public class TekSayi {
    public static void main(String[]args){
        int n;
        Scanner inp = new Scanner(System.in);

        int toplam = 0;
        int sayi;

        do {
            System.out.print("Bir sayı girin (Tek sayı girince çıkış yapılacaktır): ");
            sayi = inp.nextInt();

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
        } while (sayi % 2 != 1);

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + toplam);
    }
}
