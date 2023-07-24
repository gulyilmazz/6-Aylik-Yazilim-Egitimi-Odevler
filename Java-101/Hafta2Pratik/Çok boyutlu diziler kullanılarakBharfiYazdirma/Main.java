    import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir karakter girin: ");
            char character = scanner.next().charAt(0);
            scanner.close();

            char[][] letter = new char[6][4];

            for (int i = 0; i < letter.length; i++) {
                for (int j = 0; j < letter[i].length; j++) {
                    if (i == 0 || i == 2 || i == 5) {
                        letter[i][j] = character;
                    } else if (j == 0 || j == 3) {
                        letter[i][j] = character;
                    } else {
                        letter[i][j] = ' ';
                    }
                }
            }

            for (char[] row : letter){
                for (char col : row){
                    System.out.print(col + " ");
                }
                System.out.println();
            }
        }
    }

