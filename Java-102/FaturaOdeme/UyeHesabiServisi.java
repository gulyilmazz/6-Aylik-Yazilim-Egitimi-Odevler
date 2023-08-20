    class UyeHesabiServisi {
    private List<UyeHesabi> hesaplar = new ArrayList<>();

    public void uyeHesabiOlustur(UyeHesabi hesap) {
        hesaplar.add(hesap);
    }

    public UyeHesabi uyeHesabiGetir(int id) {
        // ID'ye göre üye hesabını getiren implementasyon...
        return null;
    }

    // Diğer CRUD metotları...
}

