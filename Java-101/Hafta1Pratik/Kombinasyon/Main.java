import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N değerini girin: ");
        int n = input.nextInt();
        System.out.print("R değerini girin: ");
        int r = input.nextInt();

        int faktoriyelN = faktoriyelHesapla(n);
        int faktoriyelR = faktoriyelHesapla(r);
        int faktoriyelNR = faktoriyelHesapla(n - r);

        int kombinasyon = faktoriyelN / (faktoriyelR * faktoriyelNR);
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
    }

    public static int faktoriyelHesapla(int sayi) {
        int faktoriyel = 1;
        int i = 1;

        while (i <= sayi) {
            faktoriyel *= i;
            i++;
        }

        return faktoriyel;

    }
}
