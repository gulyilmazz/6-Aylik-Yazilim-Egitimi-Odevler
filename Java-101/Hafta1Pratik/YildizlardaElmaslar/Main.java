
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = klavye.nextInt();

        // Üst yarım elmas
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt yarım elmas
        for (int i = n - 1; i >= 0; i--) {//yıldız azaltma
            for (int j = 0; j < (n - i); j++) {//bosluk azaltma
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {//yıldız sayısı hesabı
                System.out.print("*");
            }
            System.out.println();
        }
    }
}