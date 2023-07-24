import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100); // 0-99 arasında rastgele bir sayı seçiliyor

        Scanner input = new Scanner(System.in);
        int right = 0; // Doğru tahmin sayısını tutacak değişken
        int selected;
        int[] wrong = new int[5]; // Yanlış tahminleri tutacak dizi (en fazla 5 yanlış tahmin hakkı var)
        boolean isWin = false; // Oyunun kazanılıp kazanılmadığını tutacak boolean değişken
        boolean isWrong = false; // Hatalı giriş yapıldığında kullanılacak boolean değişken

        System.out.println("Sayı Tahmin Oyununa Hoş Geldiniz!");
        System.out.println("0-100 arasında bir sayı tuttuk, tahmin etmeye başlayabilirsiniz.");

        while (right < 5) { // 5 hakkı var
            System.out.print("Tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) { // Geçerli aralık dışında bir değer girildiğinde
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue; // Sonraki döngü turuna geç
            }

            if (selected == number) { // Doğru tahmin yapıldığında
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break; // Döngüden çık
            } else { // Yanlış tahmin yapıldığında
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected; // Yanlış tahmini yanlışlar dizisine ekle ve doğru tahmin sayısını arttır
                System.out.println("Kalan hak : " + (5 - right));
            }
        }

        if (!isWin) { // Oyun kazanılmadıysa
            System.out.println("Kaybettiniz ! Gizli sayı : " + number);
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }

    }
}