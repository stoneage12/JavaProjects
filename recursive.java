import java.util.Scanner;

public class recursive {

    static int sonuc = 1;

    static int recursive(int adet, int sayi) {
        if (adet == 0) {
            return 1;
        }
        sonuc *= sayi;
        recursive(adet - 1, sayi);
        return sonuc;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int sayi = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int adet = scan.nextInt();

        System.out.println(recursive(adet, sayi));
    }
}