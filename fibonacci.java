import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        int total =0;
        int sayac =0;
        int n1=0,n2=1,n3;
        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = input.nextInt();


        for (int i = 1; i <=sayi; i++) {

            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;


        }

    }

}
