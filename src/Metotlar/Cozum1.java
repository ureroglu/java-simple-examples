package Metotlar;

public class Cozum1 {
    //100 elemanlı bir dizi oluşturun ve bu dizinin tüm elemanlarını
    //rastgele olacak şekilde üretin. Bu işlemden sonra dizideki
    //elemanların ortalamasını hesaplayarak bu ortalamanın altında kaç
    //tane eleman olduğunu yazdırın.

    public static void main(String[] args) {
        int []sayilar = new int[100];
        int toplamSayi = 0;

        for (int i=0; i<sayilar.length; i++){
            int rastgeleSayi = (int) (Math.random()*100);
            sayilar[i] = rastgeleSayi;
            System.out.print(sayilar[i] + ",");
            toplamSayi += rastgeleSayi;

        }
        double ortalama = toplamSayi / sayilar.length;

        int ortalamaAlti = 0;

        for (int i=0; i<sayilar.length; i++){
            if (sayilar[i] < ortalama) ortalamaAlti++;
        }

        System.out.println("\nOrtalama: " + ortalama + " ortalama altındaki sayı: " + ortalamaAlti + " adet");


    }
}
