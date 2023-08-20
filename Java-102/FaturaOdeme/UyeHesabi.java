     class UyeHesabi {
    private int id;
    private String ad;
    private String soyad;
    private String kod;
    private double bakiye;

    public UyeHesabi(int id, String ad, String soyad, String kod, double bakiye) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.kod = kod;
        this.bakiye = bakiye;
    }

    // Getter metodları...

    public String uyeKoduUret() {
        return kod.substring(0, 2);
    }

         public boolean getBakiye() {
             return false;
         }
     }

