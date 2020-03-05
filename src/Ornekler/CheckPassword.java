package Ornekler;

import java.util.Scanner;

public class CheckPassword {

    public static final int SifreUzunlugu = 8;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "1. En az sekiz karakter içermelidir.\n" +
                        "2. Sadece harflerden ve rakamlardan oluşur.\n" +
                        "3. En az iki rakam içermelidir \n" +
                        "Bir şifre girin: ");
        String s = input.nextLine();

        if (gecerliSifre(s)) {
            System.out.println("Şifre geçerli: " + s);
        } else {
            System.out.println("Geçerli bir şifre değil: " + s);
        }

    }

    public static boolean gecerliSifre(String password) {

        if (password.length() < SifreUzunlugu) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (sayilar(ch)) numCount++;
            else if (harfler(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean harfler(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean sayilar(char ch) {

        return (ch >= '0' && ch <= '9');
    }

}