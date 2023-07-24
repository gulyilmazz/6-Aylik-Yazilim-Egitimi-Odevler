import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz? ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Lütfen " + n + " adet sayı girin:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                countMap.put(number, countMap.getOrDefault(number, 0) + 1);
            }
        }

        List<Integer> repeatedEvenNumbers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedEvenNumbers.add(entry.getKey());
            }
        }

        if (repeatedEvenNumbers.isEmpty()) {
            System.out.println("Girdiğiniz sayılar arasında tekrar eden çift sayı yok.");
        } else {
            System.out.println("Girdiğiniz sayılar arasında tekrar eden çift sayılar:");
            for (int number : repeatedEvenNumbers) {
                System.out.print(number + " ");
            }
        }
    }
}