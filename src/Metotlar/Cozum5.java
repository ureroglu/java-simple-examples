package Metotlar;

import java.util.Scanner;

public class Cozum5 {
    //Kullanıcının girdiği öğrenci sayısı ve kullanıcının girdiği toplam
    //soru sayısına bağlı olarak, öğrencilerin soruya verdiği cevapları
    //tutan bir matris düzenleyin. Bu değerleri rastgele olarak olusturun.
    //Değerler A,B,C,D,E olmalı.
    //Bir de doğru cevapları tutan tek boyutlu bir diziniz olsun. Bu da
    //rastgele oluşturulmalı.
    //Sonrasında bu değerleri karşılaştırarak her bir öğrencinin kaç doğru
    //ve yanlışı olduğunu gösteren programı yazınız.

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        System.out.println("Öğrenci sayısını girin");
        int ogrenciSayisi = tara.nextInt();
        System.out.println("Soru sayısını girin");
        int soruSayisi = tara.nextInt();

        char[][] tumCevaplar = new char[ogrenciSayisi][soruSayisi];
        char[] cevapAnahtari = new char[soruSayisi];

        ogrenciCevaplariniYerlestir(tumCevaplar);
        cevapAnahtariOlustur(cevapAnahtari);

        ogrenciCevaplariGoruntule(tumCevaplar);
        cevapAnahtariGoruntule(cevapAnahtari);

        ogrencileriDegerlendir(cevapAnahtari,tumCevaplar);

    }

    private static void cevapAnahtariGoruntule(char[] cevapAnahtari) {
        System.out.println("Cevap Anahtarı");
        for (int i=0; i < cevapAnahtari.length; i++){
            System.out.print(cevapAnahtari[i] + ",");
        }
        System.out.println();
    }

    private static void ogrenciCevaplariGoruntule(char[][] tumCevaplar) {
        for (int i=0; i<tumCevaplar.length; i++){
            for (int j = 0; j < tumCevaplar[i].length; j++){
                System.out.print(tumCevaplar[i][j] + ",");
            }
            System.out.println();
        }
    }

    private static void ogrencileriDegerlendir(char[] cevapAnahtari, char[][] tumCevaplar) {



        for (int i=0; i<tumCevaplar.length; i++){
            int dogruCevap = 0;
            for (int j=0; j<tumCevaplar[i].length; j++){

                if (tumCevaplar[i][j] == cevapAnahtari[j])
                    dogruCevap++;
            }
            System.out.println(i + ". öğrencinin " + dogruCevap + " doğrusu var.");
        }

    }

    private static void cevapAnahtariOlustur(char[] cevapAnahtari) {
        for (int i=0; i<cevapAnahtari.length; i++){

            cevapAnahtari[i] = cevapOlustur();
        }
    }

    private static void ogrenciCevaplariniYerlestir(char[][] tumCevaplar) {

        for (int i=0; i<tumCevaplar.length; i++){
            for (int j = 0; j < tumCevaplar[i].length; j++){
                tumCevaplar[i][j] = cevapOlustur();
            }
        }
    }

    public static char cevapOlustur(){

        int rastgeleCevap = 65 +((int) (Math.random()*5));
        char uretilenCevap = (char) rastgeleCevap;
        return uretilenCevap;

    }
}
