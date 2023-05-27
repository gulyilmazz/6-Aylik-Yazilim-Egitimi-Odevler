

    import java.util.Scanner;

    public class AtmHesap {
        public static void main(String[] args) {
            String userName, password;
            Scanner input = new Scanner(System.in);
            int right = 3;
            int balance = 1500;
            int select;

            while (right > 0) {
                System.out.print("Kullanıcı Adınız: ");
                userName = input.nextLine();
                System.out.print("Parolanız: ");
                password = input.nextLine();

                if (userName.equals("Rose") && password.equals("Software123")) {
                    System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                    do {
                        System.out.println("1- Para Yatırma");
                        System.out.println("2- Para Çekme");
                        System.out.println("3- Bakiye Sorgula");
                        System.out.println("4- Çıkış Yap");
                        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                        select = input.nextInt();

                        switch (select) {
                            case 1 -> {
                                System.out.print("Para miktarı: ");
                                int depositAmount = input.nextInt();
                                balance += depositAmount;
                                System.out.println("Yeni bakiyeniz: " + balance);
                            }
                            case 2 -> {
                                System.out.print("Para miktarı: ");
                                int withdrawAmount = input.nextInt();
                                if (withdrawAmount > balance) {
                                    System.out.println("Bakiye yetersiz.");
                                } else {
                                    balance -= withdrawAmount;
                                    System.out.println("Kalan bakiyeniz: " + balance);
                                }
                            }
                            case 3 -> System.out.println("Bakiyeniz: " + balance);
                            case 4 -> System.out.println("Tekrar görüşmek üzere.");
                            default -> System.out.println("Geçersiz bir seçim yaptınız.");
                        }
                    } while (select != 4);
                    break;
                } else {
                    right--;
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    if (right == 0) {
                        System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                    } else {
                        System.out.println("Kalan Hakkınız: " + right);
                    }
                }
            }
        }
    }

