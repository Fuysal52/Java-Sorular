package Ders02;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {
        // Kullanicidan bir karakter aliniz
        // girilen karakter kucuk harf ise "girilen harf kucuktur"
        // girilen karakter buyuk harf ise "girilen harf buyuktur"


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);

        System.out.println(girilenKarakter>='a' && girilenKarakter<='z' ? "Girilen harf kucuktur" : "Girilen harf buyuktur");
    }
}
