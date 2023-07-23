import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Matrisin satır sayısı (n): ");
            int rows = scanner.nextInt();

            System.out.print("Matrisin sütun sayısı (m): ");
            int cols = scanner.nextInt();

            int[][] matrix = new int[rows][cols];

            // Matris elemanlarını kullanıcıdan al
            System.out.println("Matris:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Eleman [" + (i + 1) + "][" + (j + 1) + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Matrisin transpozunu hesapla
            int[][] transpose = new int[cols][rows];
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < rows; j++) {
                    transpose[i][j] = matrix[j][i];
                }
            }

            // Matris ve transpozunu ekrana yazdır
            System.out.println("Transpoze:");
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();
            }

            scanner.close();
        }
    }

