import java.util.Scanner;
public class obebEkok {
    public static void main(String[] args) {



    Scanner scan = new Scanner(System.in);
    int ebob = 0;
    int ekok = 0;

        System.out.print("1. Sayıyı giriniz: ");
    int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
    int sayi2 = scan.nextInt();


         int i =1;
         while (i<sayi1){
             if (sayi1 % i == 0 && sayi2 % i == 0) {
                 ebob = i;
         }
             i++;
    }
         ekok= (sayi1*sayi2)/ebob;
        System.out.println("ekoku ="+ekok);
        System.out.println("Ebobu = "+ebob);
}
}
