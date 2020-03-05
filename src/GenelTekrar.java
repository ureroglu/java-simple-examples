import java.awt.*;
import java.util.Scanner;

public class GenelTekrar {
    public static void main(String[] args) {
    /*    //Soru1:
        //Klavyeden girilen 3 sayının ortalamasını alan bir uygulama yazınız

        System.out.println("İlk sayıyı giriniz: ");
        Scanner sayi1 = new Scanner(System.in);
        int ilkSayi = sayi1.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        Scanner sayi2 = new Scanner(System.in);
        int ikinciSayi = sayi2.nextInt();

        System.out.println("Üçüncü sayıyı giriniz: ");
        Scanner sayi3 = new Scanner(System.in);
        int ucuncuSayi = sayi3.nextInt();

        double toplam = (double)ilkSayi + ikinciSayi + ucuncuSayi;
        double sonuc = toplam/3;
        System.out.println("Sonuç: " + sonuc);

     */

    /*

         //Soru 2:
        //Klavyeden kenarları girilen bir üçgenin çeşidini veren uygulamayı yazınız.

        System.out.println("Kenar uzunluğu giriniz: ");
        Scanner kenar1 = new Scanner(System.in);
        int ilkKenar = kenar1.nextInt();

        System.out.println("Kenar uzunluğu giriniz: ");
        Scanner kenar2 = new Scanner(System.in);
        int ikinciKenar = kenar2.nextInt();

        System.out.println("Kenar uzunluğu giriniz: ");
        Scanner kenar3 = new Scanner(System.in);
        int ucuncuKenar = kenar3.nextInt();

        if (ilkKenar == ikinciKenar && ikinciKenar == ucuncuKenar){
            System.out.println("Üçgen eşkenar üşgendir.");
        }else if (ilkKenar == ikinciKenar || ikinciKenar == ucuncuKenar || ilkKenar == ucuncuKenar){
            System.out.println("Üçgen ikizkenar üçgendir.");
        }else System.out.println("Kenar uzunlukları farklı.");

     */

    /*
        //Soru3 :
        //Klavyeden girilen vize ve final notlarınına göre öğrencinin dersi geçip geçmediğini söyleyen
        //bir uygulama yazınız.(Geçme notu : 50, vizenin %40ı, finalin %60ı geçerlidir.)

        System.out.println("Vize notunuzu giriniz: ");
        Scanner taraVize = new Scanner(System.in);
        double vizeNotu = taraVize.nextDouble();

        System.out.println("Final notunuzu giriniz: ");
        Scanner taraFinal = new Scanner(System.in);
        double finalNotu = taraFinal.nextDouble();

        double gecmeNotu = vizeNotu*0.4 + finalNotu*0.6;

        if (gecmeNotu >= 50) System.out.println("Dersi geçtiniz, notunuz: "+ gecmeNotu);
        else System.out.println("Dersten kaldınız, notunuz: " + gecmeNotu);

     */


    /*
        //Soru 4:
        //Kendi adınızı ekrana 5 kere yazdıran uygulamayı tüm döngülerle yapınız.

        System.out.println("Adınızı soyadınızı yazın: ");
        Scanner tara = new Scanner(System.in);
        String isim = tara.nextLine();

        for (int i=0; i<5; i++){
            System.out.println(i +"  "+isim);
        }

        int i = 0;
        while (i<5){
            System.out.println(i+"  "+isim);
            i++;
        }

        do {
            System.out.println(i+"  "+isim);
            i++;
        }while (i<4);



     */




    /*

        //Soru 5:
        //1’den 100’e kadar olan sayıların toplamını bulan uygulamayı yazınız.

        int sonuc = 0;
        int i;
        for (i=1; i<100; i++){
            sonuc += i;
         }
         System.out.println(sonuc);

     */


/*
    //Soru 6:
        //1’den 10a kadar olan sayıları sıra ile ve aralarında virgül olacak şekilde yazan bir
        //uygulamayı for döngüsü ile yazınız. 1,2,3,........ 10


        for (int i=1; i<11; i++){

            System.out.print(i);
            if (i == 10) break;
            System.out.print(",");
        }

*/


    /*
    //Soru 7:
        //Klavyeden girilen bir sayının faktöriyelini alan bir uygulama yazınız.

        System.out.println("Sayı giriniz");
        Scanner tara = new Scanner(System.in);
        int sayi = tara.nextInt();

        int sonuc = 1;

        for (int i=1; i<=sayi; i++){
            sonuc = sonuc*i;
        }
        System.out.println("Sonuç: " + sonuc);

     */

    /*
    //Soru 8:
        //Aşağıda tanımı verilen f(x,y) fonksiyonunu klavyeden girilen x ve y değerleri için
        //hesaplayınız.
        //x>0, y<0 ise f(x,y) = 4x+2y+4
        //x>0, y=0 ise f(x,y) = 2x-y+3
        //x<0, y>0 ise f(x,y) = 3x+4y+3

        System.out.println("x değerimi girin");
        Scanner tara1 = new Scanner(System.in);
        int x = tara1.nextInt();

        System.out.println("y değerini girin");
        Scanner tara2 = new Scanner(System.in);
        int y = tara2.nextInt();

        if (x>0 && y<0) System.out.println("Sonuç: " + (4*x+2*y+4));
        else if (x>0 && y==0) System.out.println("Sonuç: " + (2*x-y+3));
        else if (x<0 && y>0) System.out.println("Sonuç: " + (3*x+4*y+3));
        else System.out.println("Hesaplanamadı");


     */

    /*
    //Soru 9:
        //100lük sistemde verilen notları harfli sistemde gösteren bir uygulama yazınız

        System.out.println("Notunuzu giriniz ");
        Scanner tara = new Scanner(System.in);
        int not = tara.nextInt();

        */


/*
     //Soru 10:
        //Çarpım tablosunu oluşturan bir uygulama yazınız.

        for (int i=1; i<11; i++){
            for (int j=1; j<11; j++){
                System.out.print(i + "*" + j + "= " + (i*j) + "\t");
            }
            System.out.println();
        }
*/




    //Soru 11:
        //Sıcak soguk oyunu yapalım. Sistem 100e kadar bir sayı üretsin. Kullanıcı bu sayıyı tahmin
        //etmeye çalışsın. Kullanıcının girdiği değere göre kullanıcıyı arttır azalt diyerek uyaralım.
        //Kullanıcı sayıyı bulana kadar tahmin istemeye devam edelim ve sayıyı buldugunda kaç denemeden
        //sonra bulduğunu belirtelim.

/*
        int sayi = (int) (Math.random() *100 + 1) ;

        for (int i=0; i<100; i++){
            System.out.println("Tahmininizi girin: ");
            Scanner tara = new Scanner(System.in);
            int tahmin = tara.nextInt();
            if (tahmin<sayi) System.out.println("Sayıyı arttırın");
            else if (tahmin>sayi) System.out.println("Sayıyı azaltın");
            else if (tahmin == sayi) {System.out.println("Bildiniz!! Tahmininiz: " + tahmin + " Sayı: " + sayi + " " + (i+1) + " denemede buldunuz.");
                                        break;}
            else System.out.println("Tahmin hakkınız dolmuştur.");

    }

*/

/*
    //SORU 12:
        //Kullanıcıdan sürekli olarak sayı alan ve de kullanıcı 0a bastığında girdiği sayıların
        //çarpımını sonuç olarak gösteren programı yazınız.

        int sonuc = 0;


        for (int i=0; i<100; i++){
            System.out.println("Sayı girin");
            Scanner tara = new Scanner(System.in);
            int sayi = tara.nextInt();

            if (sayi == 0) {
                System.out.println("Sonuç: " + sonuc);
                break;}
            sonuc = sonuc * sayi;

        }

*/
    /*

    //SORU 13:
        //Kullanıcıdan aldığınız iki integer değerin en büyük ortak bölenini bulan uygulamayı yazınız
        //Örneğin 14 ve 35 sayıları için ebob = 7 olmalıdır.

        System.out.println("İlk sayıyı giriniz: ");
        Scanner tara1 = new Scanner(System.in);
        int sayi1 = tara1.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        Scanner tara2 = new Scanner(System.in);
        int sayi2 = tara2.nextInt();

        for (int i=2; i<=sayi1 && i<=sayi2 ; i++ ){

            if (sayi1%i == 0 && sayi2%i == 0) System.out.println("Ebob: " + i);
        }

     */
/*
    //SORU 14:
        //Girilen bir metnin palindrome olup olmadığını kontrol eden programı yazınız.
        //Tersten okunuşu aynı olan kelimeler palindrome'dur. Kaçak gibi...

        Scanner tara = new Scanner(System.in);
        System.out.println("Kelime girin");
        String kelime = tara.nextLine();

        int altSinir = 0;
        int ustSinir = kelime.length() - 1;
        boolean palindromMu = true;

        while (altSinir<ustSinir){
            if (kelime.charAt(altSinir) != kelime.charAt(ustSinir)){
                palindromMu = false;
                break;
            }
            altSinir++;
            ustSinir--;
        }
        if (palindromMu){
            System.out.println(kelime + " kelimesi palindromdur.");
        }else {
            System.out.println(kelime + " kelimesi palindrom değildir.");
        }

*/

/*
        //SORU 15:
        //Kullanıcıdan aldığınız integer değere kadar olan tüm asal sayıları yazdıran programı yazınız.
        //10 için ekranda 2,3,5,7 değerleri olmalıdır.

        Scanner tara = new Scanner(System.in);

        System.out.print("Üst sınırı giriniz: ");

        int girilenSayi = tara.nextInt();

        for (int i=2; i<=girilenSayi; i++){
            boolean asalMi=true;
            for (int j=2; j<i; j++){

                if (i % j == 0){
                    asalMi = false;
                    break;
                }
            }
            if (asalMi)
                System.out.print(i+",");
        }



*/
/*
        //SORU 16:
        //1 + 2 + 4 + 7 + 11 + 16 + 20 + 23 + 25 + 26 + 28 + 31 + 35 =? işleminin sonucunu bulan java
        //projesini yazınız.

        int artis = 0;
        boolean artiyorMu = true;
        int toplam = 0;

        for(int i = 1; i<=35; i=i+artis){

            System.out.print(i);
            toplam = toplam + i;
            if (i != 35) {
                System.out.print(" + ");
            }else{
                System.out.print(" = " + toplam);
            }

            if (artis <= 4 && artiyorMu==true){
                artis++;
                if (artis == 5){
                    artiyorMu = false;
                    continue;
                }
            }else{
                artis--;
                if (artis == 1){
                    artiyorMu = true;
                    continue;
                }

            }
        }
*/


    }
}
