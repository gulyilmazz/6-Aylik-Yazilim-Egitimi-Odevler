import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args){

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        Scanner giris = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? : ");
        double armutKilo = giris.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double elmaKilo = giris.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double domatesKilo = giris.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double muzKilo = giris.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        double patlicanKilo = giris.nextDouble();

        double toplamTutar = (armutFiyat * armutKilo) + (elmaFiyat * elmaKilo) + (domatesFiyat * domatesKilo)
                + (muzFiyat * muzKilo) + (patlicanFiyat * patlicanKilo);

        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }

}
