     class YetersizBakiyeException extends Throwable extendends Exception{
    public YetersizBakiyeException(String mesaj) {
        super(mesaj);
    }
}

// Fatura tipleri için enum
    enum FaturaTipi {
    TELEFON,
    INTERNET,
    SU
}
