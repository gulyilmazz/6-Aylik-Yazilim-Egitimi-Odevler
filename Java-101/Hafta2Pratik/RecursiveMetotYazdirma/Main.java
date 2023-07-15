import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = input.nextInt();
        ekranaYazdir(n);
    }

    public static void ekranaYazdir(int n) {
        System.out.print(n + " ");
        if (n <= 0) {
            ekranaYazdirArttir(n);
            return;
        }
        ekranaYazdir(n - 5);
    }

    public static void ekranaYazdirArttir(int n) {
        if (n >= 5) {
            ekranaYazdirArttir(n - 5);
        }
        System.out.print(n + " ");
    }
}

