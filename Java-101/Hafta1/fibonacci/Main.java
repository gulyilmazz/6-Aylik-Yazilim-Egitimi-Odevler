import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Fibonacci serisinin eleman sayısını girin: ");
            int elemanSayisi = input.nextInt();

            int[] fibonacci = new int[elemanSayisi];
            fibonacci[0] = 0;
            fibonacci[1] = 1;

            for (int i = 2; i < elemanSayisi; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

            System.out.print(elemanSayisi + " Elemanlı Fibonacci Serisi: ");
            for (int i = 0; i < elemanSayisi; i++) {
                System.out.print(fibonacci[i] + " ");
            }
        }
    }

