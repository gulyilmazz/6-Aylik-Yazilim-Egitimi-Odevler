import java.util.Scanner;
public class Main {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Sayı Giriniz: ");
            int sayi = input.nextInt();

            if (asalMi(sayi)) {
                System.out.println(sayi + " sayısı ASALDIR!");
            } else {
                System.out.println(sayi + " sayısı ASAL değildir!");
            }
        }

        public static boolean asalMi(int sayi) {
            if (sayi <= 1) {
                return false;
            }

            return asalMiHelper(sayi, sayi - 1);
        }

        private static boolean asalMiHelper(int sayi, int bolen) {
            if (bolen == 1) {
                return true;
            }

            if (sayi % bolen == 0) {
                return false;
            }

            return asalMiHelper(sayi, bolen - 1);
        }
    }
