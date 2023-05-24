
    import java.util.Scanner;

    public class SayiSiralama {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Birinci sayıyı girin: ");
            int G = scanner.nextInt();

            System.out.print("İkinci sayıyı girin: ");
            int U = scanner.nextInt();

            System.out.print("Üçüncü sayıyı girin: ");
            int L = scanner.nextInt();

            if ((G < U) && (G < L)) {
                if (U < L) {
                    System.out.println("G<U<L");
                } else {
                    System.out.println("G<L<U");
                }
            } else if ((U < G) && (U < L)) {
                if (G < L) {
                    System.out.println("U<G<L");
                } else {
                    System.out.println("U<L<G");
                }
            }
        }
    }













