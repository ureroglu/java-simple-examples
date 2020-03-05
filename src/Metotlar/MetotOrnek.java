package Metotlar;

import java.util.Scanner;


public class MetotOrnek {
    public static void main(String[] args) {

        int kullaniciSecimi = -1;

        for (;;){
            kullaniciSecimi = menuGoster();
            if (kullaniciSecimi == 0){
                break;
            }else if (kullaniciSecimi<0 || kullaniciSecimi>4){
                    System.out.println("Hatalı giriş!!"); continue;
                }




        Scanner tara = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = tara.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = tara.nextInt();


        switch (kullaniciSecimi){
            case 1 : toplamaIslemi(sayi1,sayi2); break;
            case 2 : cikarmaIslemi(sayi1,sayi2); break;
            case 3 : int carpim = carpmaIslemi(sayi1,sayi2);
                System.out.println("Çarpım: " + carpim);
                        break;
            case 4 : bolmeIslemi(sayi1,sayi2); break;
        }
        }

    }

    public static void bolmeIslemi(double sayi1, double sayi2) {
        System.out.println("Bolum: " + (sayi1/sayi2));

    }

    public static int carpmaIslemi(int sayi1, int sayi2) {
        int carpim = sayi1*sayi2;
        return carpim;
    }

    public static void cikarmaIslemi(int sayi1, int sayi2) {
        System.out.println("Fark: " + (sayi1 - sayi2));
    }

    public static void toplamaIslemi(int sayi1,int sayi2) {
        System.out.println("Toplam: " + (sayi1+sayi2));
    }

    public static int menuGoster(){

        System.out.println("\n********** MENÜ **********");
        System.out.println("1. Toplama İşlemi");
        System.out.println("2. Çıkarma İşlemi");
        System.out.println("3. Çarpma İşlemi");
        System.out.println("4. Bölme İşlemi");
        System.out.println("Çıkmak için 0 tuşlayınız");

        Scanner tara = new Scanner(System.in);
        int secim = tara.nextInt();

        return secim;

    }
}
