
    import java.util.HashMap;
    import java.util.Scanner;

    public class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Dizi uzunluğunu girin: ");
            int length = scanner.nextInt();

            int[] arr = new int[length];
            System.out.println("Diziyi girin:");

            for (int i = 0; i < length; i++) {
                arr[i] = scanner.nextInt();
            }

            scanner.close();

            printFrequencies(arr);
        }

        public static void printFrequencies(int[] arr) {
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();

            // Dizideki elemanların frekanslarını hesaplayalım
            for (int num : arr) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            // Frekansları ekrana yazdıralım
            for (int key : frequencyMap.keySet()) {
                int frequency = frequencyMap.get(key);
                System.out.println(key + " sayısı " + frequency + " kere tekrar edildi.");
            }
        }
    }

