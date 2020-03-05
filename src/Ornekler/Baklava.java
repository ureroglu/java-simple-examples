package Ornekler;
import java.util.Scanner;

public class Baklava {

    public static void main(String[] args) {

        for (;;) {

            Scanner input = new Scanner(System.in);
            int boyut;
            int i, j, k, l;

            System.out.print("Boyut icin tek bir tam sayi giriniz. Çıkmak için 0 tuşlayınız: ");
            boyut = input.nextInt();

            if (boyut == 0) break;

            else if (boyut % 2 == 1) {

                for (i = 1; i <= boyut; i++) {
                    k = i <= boyut / 2 ? 2 * i - 1 : 2 * (boyut - i + 1) - 1; //5 için örnek: 1,3,5,3,1
                    j = (boyut - k) / 2; //2,1,0,1,2

                    for (l = 0; l < j; l++)
                        System.out.print(" ");

                    for (l = 0; l < k; l++)
                        System.out.print("*");

                    System.out.println();

                }
            } else System.out.println("Lütfen tek sayı girin!");
        }


    }
}