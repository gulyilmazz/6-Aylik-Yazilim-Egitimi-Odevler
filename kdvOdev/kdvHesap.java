
    import java.util.Scanner;

    public class kdvHesap {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Lütfen tutar miktarını girin: ");
            double tutar = input.nextDouble();

            double kdv_orani;

            if (tutar > 1000) {
                kdv_orani = 0.08;
            } else {
                kdv_orani = 0.18;
            }

            double kdv_tutari = tutar * kdv_orani;

            System.out.println("Girilen tutar: " + tutar + " TL");
            System.out.println("KDV oranı: " + kdv_orani);
            System.out.println("KDV tutarı: " + kdv_tutari + " TL");
        }
    }


