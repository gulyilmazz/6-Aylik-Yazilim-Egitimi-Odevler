class FaturaServisi {
    public void odemeYap(UyeHesabi hesap, Fatura fatura) throws YetersizBakiyeException {
        if (hesap.getBakiye() < fatura.getTutar()) {
            throw new YetersizBakiyeException("Ödeme için yetersiz bakiye");
        }
        // Ödemeyi gerçekleştir ve hesap bakiyesini güncelle
    }

    public void faturaSorgula(UyeHesabi hesap, Fatura fatura) {
        // Fatura detaylarını sorgulama implementasyonu...
    }

    public void odemeyiIptalEt(UyeHesabi hesap, Fatura fatura) {
        // Ödemeyi iptal etme implementasyonu...
    }
}

