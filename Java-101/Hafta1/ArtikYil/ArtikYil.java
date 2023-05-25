import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.print("Yıl Girin: ");
        int yil = giris.nextInt();


        if (yil > 0) {
            boolean artikYil = (yil % 4 == 0) && (yil % 100 != 0 || yil % 400 == 0);

            if (artikYil) {
                System.out.println(yil + " bir artık yıldır !");
            } else {
                System.out.println(yil + " bir artık yıl değildir !");
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz!!!");
        }

    }
}