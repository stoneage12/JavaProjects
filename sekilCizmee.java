import java.util.Scanner;

public class sekilCizmee {
        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            int k,n,l,m;
            System.out.println("Sayi giriniz");
            n=input.nextInt();


            for (k=0;k<=n;k++)
            {
                for (l =0 ; l <=k; l++)
                {
                    System.out.print(" ");
                }
                for (m = n; m >k ; m--)
                {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
        }
    }

