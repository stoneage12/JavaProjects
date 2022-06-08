import java.util.Scanner;

public class atmUygulamasi {
    public static void main(String[] args) {
        String id = "ferdi";
        String pass = "7h52gelx3";
        int balance = 1500;
        int money;
        int money2;
        int sayac = 3;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz :");
        String userName = input.nextLine();
        while (!(userName.equals(id))) {

            System.out.println("kullanıcı adınız yanlıs");
            String a = input.nextLine();
            if (a.equals(id)) {
                break;
            }
        }
        System.out.println("Sifrenizi giriniz :");
        String password = input.nextLine();
        String b = "";
        while (!(password.equals(pass))) {


            System.out.println("hatalı tekrar giriniiz. Kalan hakkınız : " + sayac);
            password = input.nextLine();
            sayac--;

            if (sayac == 0) {
                System.out.println("hesabınız bloke olmuştur");
                return;
            }
        }
        System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
        System.out.println("1-Para yatırma\n" +
                "2-Para Çekme\n" +
                "3-Bakiye Sorgula\n" +
                "4-Çıkış Yap");
        int select = input.nextInt();

        while (select < 1 || select > 4) {


            System.out.println("hatalı işlem seçimi : ");
            select = input.nextInt();
            sayac--;

            if (sayac == 0) {
                System.out.println("hesabınızdan çıkılıyor. Kartınızı alınız");
                return;
            }
        }

        switch (select) {

            case 1:
                if (select == 1) {
                    System.out.println("yüklemek isediğiniz tutarı giriniz");
                    money = input.nextInt();
                    balance += money;
                    System.out.println("yeni bakiyeniz :" + balance);

                }
            case 2:
                if (select == 2) {

                    System.out.println("Çekmek istedipiniz tutarı giriniz");
                    money2 =input.nextInt();
                    balance =balance-money2;
                    System.out.println("Kalan Bakiyeniz :" + balance);
                }
            case 3:
                if (select == 3) {


                    System.out.println("Bakiyeniz :" + balance);
                }
            default:
                System.out.println("Çıkış yapıldı. İyi Günler");
        }
    }
}

