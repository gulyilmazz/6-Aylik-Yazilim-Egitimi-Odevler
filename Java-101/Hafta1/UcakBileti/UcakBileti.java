import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe, yas, yolculukTipi;


        System.out.println("Mesafeyi(km cinsinden) giriniz");
        mesafe = input.nextInt();

        System.out.println("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.println("Yolçuluk tpi şeçiniz: ");
        yolculukTipi = input.nextInt();

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            double birimFiyat = 0.10;
            double toplamFiyat = mesafe * birimFiyat;

            if (yas < 12) {
                toplamFiyat *= 0.50;
            } else if (yas >= 12 && yas <= 24) {
                toplamFiyat *= 0.90;
            } else if (yas >= 65) {
                toplamFiyat *= 0.70;
            }

            if (yolculukTipi == 2) {
                toplamFiyat *= 0.80;
            }
            System.out.println("Toplam Tutar: " + toplamFiyat + " TL");
        }
        else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}

