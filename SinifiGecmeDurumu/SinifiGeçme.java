import java.util.Scanner;

public class SinifiGeçme {
    public static void main(String[]args){
        int mat,türkce,fiz,muzik,kim;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        türkce = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fiz=input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kim = input.nextInt();

        int toplamNot = 0;
        int dersSayisi = 0;

        if (mat >= 0 && mat <= 100) {
            toplamNot += mat;
            dersSayisi++;
        }

        if (fiz >= 0 && fiz <= 100) {
            toplamNot += fiz;
            dersSayisi++;
        }

        if (türkce >= 0 && türkce<= 100) {
            toplamNot += türkce;
            dersSayisi++;
        }

        if (kim >= 0 && kim <= 100) {
            toplamNot += kim;
            dersSayisi++;
        }

        if (muzik >= 0 && muzik <= 100) {
            toplamNot += muzik;
            dersSayisi++;
        }

        double ortalama = (double) toplamNot / dersSayisi;

        if (dersSayisi > 0) {
            System.out.println("Ortalama: " + ortalama);
            System.out.println(ortalama >= 55 ? "Geçtiniz!" : "Kaldınız!");
        } else {
            System.out.println("Geçerli not girişi yapılmadı.");
        }
    }
}
