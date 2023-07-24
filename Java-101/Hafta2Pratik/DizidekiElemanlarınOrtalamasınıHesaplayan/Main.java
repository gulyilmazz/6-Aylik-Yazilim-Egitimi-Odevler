import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < size; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        double harmonicSum = 0;

        // Harmonik seriyi hesapla
        for (int i = 0; i < numbers.length; i++) {
            harmonicSum += 1.0 / numbers[i];
        }

        double harmonicMean = numbers.length / harmonicSum;
        System.out.println("Harmonik Ortalama: " + harmonicMean);

        scanner.close();
    }
}