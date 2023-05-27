import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();

        int toplam = 0;
        int temp = sayi;
        int basamakSayisi = String.valueOf(sayi).length();
        // sayının string haline dönüştürülüp uzunluğunun alınmasıyla basamak sayısını hesaplar.

        while ( temp != 0 ){
            int basamak = temp % 10;
            toplam += Math.pow(basamak, basamakSayisi);
            temp /= 10;

        }

        if(toplam == sayi){
            System.out.println(sayi + "bir Amstrong sayıdır.");
        }else {
            System.out.println(sayi + "bir Armstrong sayı değildir.");
        }
    }
}
