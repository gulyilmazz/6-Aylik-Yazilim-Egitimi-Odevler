import java.util.Scanner;
public class TaksimetreHesapla {
    public static void main(String[]args){
       int km;
       double perKm = 2.20,total,baslamaFiyati=10;

       Scanner input = new Scanner(System.in);
       System.out.print("Mesafeyi KM cinsinden gir: ");
       km = input.nextInt();

       total= (km + perKm);
       total += baslamaFiyati;

       total = (total < 20) ? 20: total ;
       System.out.println("Toplam Tutar :" + total);

    }
}
