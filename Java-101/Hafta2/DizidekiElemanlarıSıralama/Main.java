
import java.util.Arrays;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Dizinin boyutu n: ");
            int n = scanner.nextInt();

            int[] array = new int[n];
            System.out.println("Dizinin elemanlarını giriniz:");

            // Dizinin elemanlarını kullanıcıdan alır
            for (int i = 0; i < n; i++) {
                System.out.print((i + 1) + ". Elemanı: ");
                array[i] = scanner.nextInt();
            }

            // Diziyi küçükten büyüğe sıralar
            Arrays.sort(array);

            // Sıralanmış diziyi ekrana yazdırır
            System.out.print("Sıralama: ");
            for (int num : array) {
                System.out.print(num + " ");
            }

            scanner.close();
        }
    }

