
import java.util.Scanner;

public class HavaSicikligi {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklık değerini girin: ");
        int sicaklik = scanner.nextInt();

        boolean kayak = sicaklik < 5;
        boolean sinema = sicaklik >= 5 && sicaklik <= 15;
        boolean piknik = sicaklik > 15 && sicaklik <= 25;
        boolean yuzme = sicaklik > 25;

        if (kayak) {
            System.out.println("Kayak yapmayı öneririm.");
        } else if (sinema) {
            System.out.println("Sinema etkinliğini öneririm.");
        } else if (piknik) {
            System.out.println("Piknik etkinliğini öneririm.");
        } else if (yuzme) {
            System.out.println("Yüzme etkinliğini öneririm.");
        }
    }
}


