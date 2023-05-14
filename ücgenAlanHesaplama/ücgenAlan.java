
    import java.util.Scanner;

    public class ücgenAlan {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Lütfen üçgenin kenar uzunluklarını girin:");

            System.out.print("a: ");
            double a = input.nextDouble();

            System.out.print("b: ");
            double b = input.nextDouble();

            System.out.print("c: ");
            double c = input.nextDouble();

            // yarı çevre hesaplaması yapılıyor
            double u = (a + b + c) / 2;

            // alan hesaplaması yapılıyor
            double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

            System.out.println("Girilen kenar uzunluklarına sahip üçgenin alanı: " + alan);
        }
    }
