import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        //Deeğiskenler iolustur
        int mat, fiz, kim, türkce, tarih, müzik;

        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan degerleri al
        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();
        System.out.println(mat);

        System.out.print("Fizik notunuz : ");
        fiz = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kim = inp.nextInt();

        System.out.print("Türkçe notunuz : ");
        türkce = inp.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz : ");
        müzik = inp.nextInt();

        int toplam =(mat+fiz+kim+türkce+tarih+müzik);
        double sonuc=toplam/6.0;
        System.out.println("ortalamanız: " +sonuc);

        System.out.println(sonuc >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
        inp.close();
    }
 }