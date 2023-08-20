import java.time.Instant;
import java.time.LocalDate;
    class Ana {

        public static void main(String[] args) {
        // Sınıfların ve metodların örnek kullanımı
        UyeHesabi hesap = new UyeHesabi(1, "Ahmet", "Yılmaz", "AY123", 1000.0);
        UyeHesabiServisi hesapServisi = new UyeHesabiServisi();
        hesapServisi.uyeHesabiOlustur(hesap);

            Fatura fatura = new Fatura(50.0, LocalDate, FaturaTipi.TELEFON);
            Istemci istemci = new Istemci();
        try {
            istemci.faturaOde(hesap, fatura, FaturaTipi.TELEFON);
        } catch (YetersizBakiyeException e) {
            System.out.println("Ödeme başarısız: " + e.getMessage());
        }
    }
}
