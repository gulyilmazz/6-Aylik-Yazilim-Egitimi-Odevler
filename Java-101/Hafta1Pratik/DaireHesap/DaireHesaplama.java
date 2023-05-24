
import java.util.Scanner;
public class DaireHesaplama {
    public static void main(String []args){

        double pi = 3.14;
        Scanner giris = new Scanner(System.in);

        System.out.print("Daire diliminin yarıçapını giriniz:");
         int r = giris.nextInt();

         System.out.print("Merkez açısının ölçüsünü giriniz: ");
         double aci = giris.nextInt();
          //DLA = Daire Dilimi Alanı
         double DLA = (pi * (r * r) * aci)/360;
          System.out.println("Daire dilimi alanı: " + DLA);

    }
}
