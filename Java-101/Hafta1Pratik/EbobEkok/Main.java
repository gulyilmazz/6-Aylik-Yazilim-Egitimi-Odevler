import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        int ebob = 1;
        int ekok = 1;

        int k = 2;
        while (k <= sayi1 && k <= sayi2) {
            if (sayi1 % k == 0 && sayi2 % k == 0) {
                ebob = k;
                break;
            }
            k++;
        }

        ekok = (sayi1 * sayi2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}