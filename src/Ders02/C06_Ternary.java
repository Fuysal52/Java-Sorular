package Ders02;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        // Kullanicidan yasini isteyiniz
        // yasi 65 ve uzeri ise "Emekli olabilirsin"
        // yasi 65 den kucuk ise "Emekli olman icin gereken yil sayisi : " yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();
        int kalanYilSayisi = 65 - yas;

        System.out.println(yas>=65 ? "Emekli olabilirsin" : "Emekli olman icin "+ kalanYilSayisi + " yil gerekli");
    }
}
