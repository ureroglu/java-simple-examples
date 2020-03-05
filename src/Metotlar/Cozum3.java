package Metotlar;

public class Cozum3 {
    //Iskambil destesini diziler ile olusturun. Sonrasında bu destedeki
    //elemanları karıştırın ve de ilk kullanıcıya hangi 4 kartın geldiğini
    //ekrana yazdırın.


    public static void main(String[] args) {
        
    String kartTurleri[] = {"Karo", "Kupa", "Maça", "Sinek"};
    String kartNumaralari[] = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    int deste[] = new int[52];
    
    desteyiOlustur(deste);
    desteyiKaristir(deste);
    desteyiGoster(deste,kartNumaralari,kartTurleri);
    
    }

    private static void desteyiKaristir(int[] deste) {

        for (int i=0; i<deste.length; i++){

            int rastgeleSayi = (int) (Math.random() * deste.length);
            int gecici = deste[i];
            deste[i] = deste[rastgeleSayi];
            deste[rastgeleSayi] = gecici;
        }
    }

    private static void desteyiGoster(int[] deste, String[] kartNumaralari, String[] kartTurleri) {

        for (int i=0; i<14; i++){

            String kartTuru = kartTurleri[deste[i] / 13];
            String kartNumarasi = kartNumaralari[deste[i] % 13];


            System.out.println(kartTuru + " " + kartNumarasi);
        }
    }

    private static void desteyiOlustur(int[] deste) {

        for (int i=0; i<deste.length; i++){
        deste[i]= i;
    }
    }
}