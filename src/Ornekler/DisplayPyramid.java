package Ornekler;

import java.util.Scanner;

public class DisplayPyramid {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        System.out.print("1 ile 15 arasında sayı giriniz: ");
        int boyut = tara.nextInt();

        if (boyut<1) System.out.println("Sayı 1'den küçük");
        else if (boyut>15) System.out.println("Sayı 15'den büyük");
        else {

            for (int satir = 1; satir <= boyut; satir++) {
                for (int i = boyut - satir; i >= 1; i--) {
                    System.out.print("  ");
                }

                for (int j = satir; j >= 1; j--) {
                    System.out.print(j + " ");
                }

                for (int k = 2; k <= satir; k++) {
                    System.out.print(k + " ");
                }

                System.out.println();
            }
        }
    }
}
