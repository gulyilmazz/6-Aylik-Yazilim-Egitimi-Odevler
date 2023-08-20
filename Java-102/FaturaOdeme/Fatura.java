import java.time.LocalDate;

class Fatura {
     private final LocalDate islemTarihi;
     private double tutar;
    private static java.time.LocalDate LocalDate;
    private FaturaTipi faturaTipi;

    public Fatura(double tutar, LocalDate islemTarihi, FaturaTipi faturaTipi) {
        this.tutar = tutar;
        this.islemTarihi = islemTarihi;
        this.faturaTipi = faturaTipi;
    }

     public Fatura(double tutar, java.time.LocalDate now, FaturaTipi faturaTipi) {
     }

    public Fatura(double v, java.time.LocalDate now, FaturaTipi faturaTipi) {
    }

    public Fatura(String v, java.time.LocalDate now, FaturaTipi faturaTipi) {
    }

    public Object getTutar() {
     }

     public Object getTutar() {
     }

     public Object getTutar() {
         return null;
     }

     // Getter metodları...
}

