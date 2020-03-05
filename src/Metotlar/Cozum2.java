package Metotlar;

public class Cozum2 {
    //Her bir elemanı rastgele oluşturulmuş 3*2lik bir matriste bulunan
    //sayıların toplamını yazdıran program yazınız.Ayrıca bu matriste yer
    //alan en küçük ve en büyük sayıyı da mesaj olarak göstersin.

    public static void main(String[] args) {
        int matris[][] = new int[3][2];
        int enKucuk = 100, enBuyuk = 0;

        for (int i=0; i<matris.length; i++){

            for (int j=0; j<matris[i].length; j++){

                int rastgeleSayi = (int) (Math.random()*100);
                matris[i][j] = rastgeleSayi;
                System.out.println(i + ". satır " + j + ". sütun: " + matris[i][j]);

                if (enBuyuk < rastgeleSayi) enBuyuk = rastgeleSayi;
                if (enKucuk > rastgeleSayi) enKucuk = rastgeleSayi;

            }

        }
        System.out.println("En küçük sayı: " + enKucuk + " En büyük sayı: " +enBuyuk);
    }
}
