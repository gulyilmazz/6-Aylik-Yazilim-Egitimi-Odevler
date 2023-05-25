import java.util.Scanner;
public class SayiyiBulma {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int k;
        System.out.print("Sayi Giriniz :");
        k = input.nextInt();
        double toplam = 0;
        int sayac = 0;

        for( int i=0; i<k; i++){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.println(i);
                toplam += i;
                sayac++;
            }
        }
        if (sayac > 0) {
            double ortalama = toplam / sayac;
            System.out.println("Ortalama: " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }
    }
}
