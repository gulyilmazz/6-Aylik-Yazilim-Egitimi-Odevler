import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("N Sayısı: ");
            int n = scanner.nextInt();

            System.out.println("Çıktısı:");
            recursiveMethod(n);

            scanner.close();
        }

        public static void recursiveMethod(int n) {
            // Base case: Eğer n 0 veya daha küçükse işlemi sonlandırıp ve metottan çıkar
            if (n <= 0) {
                System.out.print(n + " ");
                return;
            }

            // Sayıdan 5 çıkar ve sonucu ekrana yazdırır
            System.out.print(n + " ");

            // n - 5 ile recursiveMethod'ı tekrar çağırır
            recursiveMethod(n - 5);

            // Metottan çıktıktan sonra sayıya 5 ekleyip sonucu ekrana yazdırır
            System.out.print(n + " ");
        }
    }

