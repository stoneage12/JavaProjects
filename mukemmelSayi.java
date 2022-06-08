import java.util.Scanner;
public class mukemmelSayi {

    public static void main(String[] args) {

        int toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi =input.nextInt();

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){

                 toplam +=i;
            }


        }
        if (toplam==sayi*2)
        {
        System.out.println(sayi+" sayisi Mükemmel bir sayidir");
        }
        else {
            System.out.println(sayi+" sayisi Mükemmel bir sayi Değildir");
        }

}
}

