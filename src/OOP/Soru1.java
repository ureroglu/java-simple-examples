//Soru 1
//CemberDaire isimli sınıf oluşturun. Bu sınıfın yarıçap alan kurucusu
//olmalı.Ayrıca cevre ve alanını hesaplayan metotlar olmalı.

package OOP;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        System.out.println("Yarıçap girin");
        Scanner tara = new Scanner(System.in);
        int r = tara.nextInt();


        cemberDaire cember1 = new cemberDaire(r);
        System.out.printf("Yarıçapı " +r+ " olan çemberin çevresi: %.2f" , cember1.cevreBul());
        System.out.println("\nYarıçapı "+r+" olan dairenin alanı: " + cember1.alanBul());


    }
}

class cemberDaire{

    private int yariCap;
    public final static double PI = 3.14;

    public cemberDaire(int r){
        this.yariCap = r;
    }

    public double cevreBul(){
        return 2 * PI * yariCap;
    }

    public double alanBul(){
        return PI * Math.pow(yariCap,2);
    }
}
