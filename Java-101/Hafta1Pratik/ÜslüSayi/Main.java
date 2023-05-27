import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tabanı girin: ");
        int taban = input.nextInt();
        System.out.print("Üssü girin: ");
        int us = input.nextInt();

        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }

        System.out.println(taban + "^" + us + " = " + sonuc);
    }
}

