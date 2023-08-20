 class Istemci extends FaturaServisi {
     public void faturaOde(UyeHesabi hesap, Fatura fatura, FaturaTipi faturaTipi) throws YetersizBakiyeException {
         if (faturaTipi == FaturaTipi.TELEFON) {
             super.odemeYap(hesap, fatura);
             // Telefon faturası ödemesine özgü implementasyon
         } else if (faturaTipi == FaturaTipi.INTERNET) {
             super.odemeYap(hesap, fatura);
             // İnternet faturası ödemesine özgü implementasyon
         } else if (faturaTipi == FaturaTipi.SU) {
             super.odemeYap(hesap, fatura);
             // Su faturası ödemesine özgü implementasyon
         }
     }
 }
