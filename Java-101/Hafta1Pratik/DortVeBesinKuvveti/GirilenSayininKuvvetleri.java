import java.util.Scanner;

public class GirilenSayininKuvvetleri {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Sınır sayısı giriniz: ");
        int k = inp.nextInt();

        int i,n;
        for (i = 1; i <= k; i *= 4) {
            System.out.println("4'ün kuvvetleri: "  +i);
        }
        for (n = 1; n<= k; n*= 5)
            System.out.println("5 in kuvvetleri: "  +n);
    }
}
