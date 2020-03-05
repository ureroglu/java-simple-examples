package Metotlar;

public class Cozum4 {
    //Verilen iki sayının en küçük ortak katını bulan uygulamayı yazınız.
    //Ekok(s1,s2) * ebob(s1,s2) = (s1*s2); buna uygun olacak şekilde
    //bulunuz

    public static void main(String[] args) {

        int birinciSayi = 40, ikinciSayi=80;

        int ekok = ekokubul(birinciSayi,ikinciSayi);

        System.out.println(birinciSayi + " ile " + ikinciSayi + " ekoku: " + ekok);
    }

    private static int ekokubul(int birinciSayi, int ikinciSayi) {

        int buyuk = Math.max(birinciSayi, ikinciSayi);
        int ekok = 0;

        for (int i=buyuk; i <= birinciSayi*ikinciSayi; i++){
            if (i % birinciSayi == 0 && i % ikinciSayi == 0){
                ekok = i;
                break;
            }
        }
        return  ekok;
    }
}
