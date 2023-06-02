import java.util.Scanner;
public class Main {
    public static void main(String[]args){

        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();
        System.out.println("Bir sayı giriniz ");

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println("Mükemmel sayıdır.");
        } else {
            System.out.println("Mükemmel sayı değildir.");
        }
    }

}
