    class Musteri extends FaturaServisi {
    public void faturaOde(UyeHesabi hesap, Fatura fatura, FaturaTipi faturaTipi) throws YetersizBakiyeException {
        if (faturaTipi == FaturaTipi.TELEFON) {
            super.odemeIslemi(hesap, fatura);
            // Telefon faturası ödeme işlemine özgü implementasyon
        } else if (faturaTipi == FaturaTipi.INTERNET) {
            super.odemeIslemi(hesap, fatura);
            // İnternet faturası ödeme işlemine özgü implementasyon
        } else if (faturaTipi == FaturaTipi.SU) {
            super.odemeIslemi(hesap, fatura);
            // Su faturası ödeme işlemine özgü implementasyon
        }
    }
}
