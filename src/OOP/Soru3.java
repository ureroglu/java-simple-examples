//Soru 3
//Hesap makinesi sınıfı oluşturun.Bu sınıfta 4 işlem yapabilmek için
//metotlarınız olsun. Bu metotlara istenilen sayıda parametre geçilebilmeli.
//Bölme işlemi için 0 değerini için gerekli kontrolü yazın.
package OOP;

public class Soru3 {
    public static void main(String[] args) {

        System.out.println("Topla: " + HesapMakinesi.topla(10,12,14));
        System.out.println("Fark: " + HesapMakinesi.cikar(15,4,3));
        System.out.println("Çarpım: " + HesapMakinesi.carp(10,12,5));
        if (HesapMakinesi.bol(50,5,0) != -1)
        System.out.println("Bölüm: " + HesapMakinesi.bol(50,5,0));
        else
            System.out.println("Bolüm işlemi başarısız");

    }
}

class HesapMakinesi{

    public static int topla(int... parametreler){

        int toplam = 0;
        for (int parametre : parametreler){
            toplam = toplam + parametre;
        }

        return  toplam;
    }

    public static int cikar(int... parametreler){

        int fark = parametreler[0];
        for (int i=1; i<parametreler.length; i++){
            fark = fark - parametreler[i];
        }

        return fark;
    }

    public static int carp(int... parametreler){

        int carpim = 1;
        for (int parametre : parametreler){
            carpim = carpim * parametre;
        }

        return carpim;
    }

    public static double bol(int... parametreler){

        int bolum = parametreler[0];
        for (int i=1; i<parametreler.length; i++){
            if (parametreler[i] != 0){
                bolum = bolum / parametreler[i];
            }else {
                System.out.println("Parametrelerden biri 0 bölme yapılamadı");
                return -1;
            }
        }
        return bolum;
    }

}
