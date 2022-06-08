import java.util.Scanner;
public class harmonikSayilar {

    public static void main(String[] args) {


        double toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = input.nextInt();


        for (int i = 1; i <=sayi; i++) {

            toplam += (1.0/i);


        }
        System.out.println(toplam);

    }
}
