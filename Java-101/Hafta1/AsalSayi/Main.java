public class Main {
    public static void main(String[] args) {
        int altSinir = 1;
        int ustSinir = 100;

        System.out.println(altSinir + " ile " + ustSinir + " arasindaki asal sayilar:");

        for (int sayi = altSinir; sayi <= ustSinir; sayi++) {
            boolean asalMi = true;

            for (int i = 2; i <= Math.sqrt(sayi); i++) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi && sayi > 1) {
                System.out.println(sayi);
            }
        }
    }
}
