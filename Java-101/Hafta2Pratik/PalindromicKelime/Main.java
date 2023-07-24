import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        if (isPalindrom(kelime)) {
            System.out.println(kelime + " kelimesi palindromiktir.");
        } else {
            System.out.println(kelime + " kelimesi palindromik değildir.");
        }
    }

    public static boolean isPalindrom(String kelime) {
        int i = 0;
        int j = kelime.length() - 1;

        while (i < j) {
            if (kelime.charAt(i) != kelime.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
