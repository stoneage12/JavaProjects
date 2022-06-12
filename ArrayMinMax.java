import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner input = new Scanner(System.in);
        //System.out.println("sayi giriniz");
        int sayi = 12;

        int beforeMax = list[0];
        int afterMin = list[0];
        Arrays.sort(list);

        for (int i: list){
            if (sayi>i){
                afterMin = i;
            }
            if (sayi<i){
                beforeMax =i;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : "+ afterMin);
        System.out.println("Girilen sayıdan büyük en yakın sayı "+beforeMax);

    }

}








