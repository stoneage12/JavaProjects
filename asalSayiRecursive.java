import java.util.Scanner;

public class asalSayiRecursive {

    static int asalSayi(int a)
    {


                if (a%2==1||a==2)
                {
                    System.out.println("asal sayidir");

                }
                else {
                    System.out.println("asal sayi değildir");
                }
               return 1;
        }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = input.nextInt();

        asalSayi(sayi);

    }
}





