
import java.util.Scanner;

public class SifreYönetimi {
    public static void main(String[] args) {
        String dogruSifre = "sifre123"; // Doğru şifreyi burada belirtiriz
        String kullaniciAdi, sifre;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        kullaniciAdi = scanner.nextLine();

        System.out.print("Şifre: ");
        sifre = scanner.nextLine();

        if (sifre.equals(dogruSifre)) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Hatalı şifre!");

            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            String cevap = scanner.nextLine();

            if (cevap.equalsIgnoreCase("evet")) {
                System.out.print("Yeni şifre: ");
                String yeniSifre = scanner.nextLine();

                if (yeniSifre.equals(sifre) || yeniSifre.equals(dogruSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                    dogruSifre = yeniSifre;
                }
            }
        }
    }
}

