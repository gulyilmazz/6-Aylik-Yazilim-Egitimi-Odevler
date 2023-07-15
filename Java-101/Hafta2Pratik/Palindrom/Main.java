import java.util.Scanner;
public class Main {
    static boolean isPalindrom(int number){
        //bir metod dönderip true mu false mı anlıcaz
        int temp = number,reverseNumber = 0,lastNumber;
        while(temp != 0){
            System.out.println("=========");
            System.out.println("Sayi => " +temp);

            lastNumber = temp % 10;
            System.out.println("Son Basamak => "+lastNumber);

            reverseNumber = (reverseNumber * 10)+ lastNumber;
            System.out.println("Yeni Sayi => " +reverseNumber);

            temp /= 10;
            System.out.println("Yeni temp=> " +temp);
        }
        return true;
    }
    public static void main(String[]args){
        int number;
        isPalindrom (number= 2476);
    }
}
