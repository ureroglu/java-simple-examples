//Soru 4
//Bir banka hesabı için sınıf tasarlayın. Bu sınıfta hesabın kime ait oldugunu
//tutan hesapNo, hesaptakiPara, para yatirma ve çekme metotları olsun.
//Ayrıca bu hesaplarda olan tüm parayı, açılan hesap sayısını, yapılan toplam
//paracekme ve para yatırma sayısını gösteren bir metot ve iki hesabı para
//değişkenine göre birbiriyle kıyaslayacak metot bulunmalı.
package OOP;

public class Soru4 {
    public static void main(String[] args) {

        BankaHesap ugur = new BankaHesap(1,7500);
        BankaHesap ali = new BankaHesap(2,500);
        BankaHesap veli = new BankaHesap(3,2535);

        ugur.paraYatir(500);
        ali.paraYatir(755);
        veli.paraCek(5000);
        ugur.paraCek(200);
        ali.paraYatir(8000);
        BankaHesap.bankaOzetiGoster();

        ugur.kiyasla(ali);
        veli.kiyasla(ali);

    }
}

class BankaHesap{

    private int hesapNo;
    private int hesapBakiye;
    private static int tumBankaBakiyesi=0;
    private static int tumHesapSayisi = 0;
    private static int operasyonSayisi=0;


    public BankaHesap(int hesapNo, int hesapBakiye) {
        this.hesapNo = hesapNo;
        this.hesapBakiye = hesapBakiye;
        tumBankaBakiyesi += hesapBakiye;
        tumHesapSayisi ++;
    }


    public int getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(int hesapNo) {
        this.hesapNo = hesapNo;
    }

    public int getHesapBakiye() {
        return hesapBakiye;
    }

    public void setHesapBakiye(int hesapBakiye) {
        this.hesapBakiye = hesapBakiye;
    }

    public void kiyasla(BankaHesap kiyaslanacakHesap){

        if (this.getHesapBakiye() < kiyaslanacakHesap.getHesapBakiye()){
            System.out.println(this.getHesapNo() + " kişisinin parası " + kiyaslanacakHesap.getHesapNo()+ " kişisinin parasından azdır");
        }else if (this.getHesapBakiye() > kiyaslanacakHesap.getHesapBakiye()){
            System.out.println(this.getHesapNo() + " kişisinin parası " + kiyaslanacakHesap.getHesapNo()+ " kişisinin parasından fazladır");
        }else{
            System.out.println(this.getHesapNo() + " kişisinin parası " + kiyaslanacakHesap.getHesapNo()+ " kişisinin parasına eşittir.");

        }
    }

    public void paraYatir(int paraMiktari){
        this.hesapBakiye += paraMiktari;
        operasyonSayisi++;
    }

    public void paraCek(int paraMiktari) {
        if (hesapBakiye >= paraMiktari) {
            this.hesapBakiye -= paraMiktari;
            operasyonSayisi++;
            tumBankaBakiyesi -= paraMiktari;
        } else {
            System.out.println("Hesabınızda para yok!");
        }
    }

    public static void bankaOzetiGoster(){

        System.out.println("Bankadaki hesap sayısı: " + tumHesapSayisi);
        System.out.println("Bankadaki toplam para: " + tumBankaBakiyesi);
        System.out.println("Bankada yapılan işlem sayısı: " + operasyonSayisi);
    }
}