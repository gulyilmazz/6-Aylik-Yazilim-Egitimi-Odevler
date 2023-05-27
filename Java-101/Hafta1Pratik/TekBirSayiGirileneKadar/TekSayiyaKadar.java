import java.util.Scanner;
public class TekSayiyaKadar {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        do {
            System.out.println("Sayı giriniz (Programdan çıkmanın tek yolu tek girmek):");
            sayi = input.nextInt();

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }

        } while (sayi % 2 != 1 );
        //Girilen sayı tek olduğunda döngü sona erer

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
    }
}
