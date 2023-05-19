
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String [] args){

        Scanner giris = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz: ");
        double N1 = giris.nextDouble();
        System.out.println("İkinci sayiyi giriniz: ");
        double N2 = giris.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz: ");
        int secim = giris.nextInt();

        double sonuc = 0;

        switch (secim) {
            case 1:
                sonuc = N1 + N2;
                break;
            case 2:
                sonuc = N1 - N2;
                break;
            case 3:
                sonuc = N1 * N2;
                break;
            case 4:
                sonuc = N1 / N2;
                break;
            default:
                System.out.println("Geçersiz seçim!");
                return;
        }
        System.out.println("Sonuç:" + sonuc);

        }
    }

