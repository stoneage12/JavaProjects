import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {

        int adet;
        int max = 0;
        int min =0;
        int sayi =0;


        Scanner input = new Scanner(System.in);
        System.out.println("kaç adet sayi giriliecek");
        int n=input.nextInt();
        for (int i = 1; i <= n; i++)
        {
            System.out.print(i+".sayıyı giriniz ");
             sayi =input.nextInt();
            if(i==1)
            {
                max = sayi;
                min = sayi;
            }
            if (min > sayi)
            {
                min=sayi;
            }
            if (max < sayi)
            {
                max = sayi;
            }
        }
        System.out.println("En büyük say :"+ max);
        System.out.println("En büyük say :"+ min);
        }
    }



