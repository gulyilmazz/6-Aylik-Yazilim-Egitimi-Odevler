
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir sayı girin: ");
            int target = scanner.nextInt();
            scanner.close();

            int minClosest = Integer.MIN_VALUE;
            int maxClosest = Integer.MAX_VALUE;

            for (int i : list) {
                if (i < target && i > minClosest) {
                    minClosest = i;
                }
                if (i > target && i < maxClosest) {
                    maxClosest = i;
                }
            }

            System.out.println("Girilen sayıdan küçük en yakın sayı: " + minClosest);
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + maxClosest);
        }
    }

