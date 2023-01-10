package Ders01;

import java.util.Scanner;

public class C04_Wrappers_Class {
    public static void main(String[] args) {
        // Kullanicidan 4 basamakli bir sayi aliniz
        // sayinin ilk iki rakami ile son iki rakami farkini ve toplamini bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz = ");
        int sayi = scan.nextInt(); // 2211

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int sonIkiRakamToplami=0;
        int ilkIkiRakamToplami=0;

        birlerBasamagi=sayi%10; // 1
        ilkIkiRakamToplami=ilkIkiRakamToplami+birlerBasamagi; // 1
        sayi=sayi/10; // 221

        birlerBasamagi=sayi%10; // 1
        ilkIkiRakamToplami=ilkIkiRakamToplami+birlerBasamagi; // 2
        sayi=sayi/10; // 22


        birlerBasamagi=sayi%10; // 2
        sonIkiRakamToplami=sonIkiRakamToplami+birlerBasamagi; // 2
        sayi=sayi/10; // 2

        birlerBasamagi=sayi%10; // 2
        sonIkiRakamToplami=sonIkiRakamToplami+birlerBasamagi; // 4
        sayi=sayi/10; // 2

        System.out.println("Sayinin ilk iki rakami ile son iki rakami toplami :" +(ilkIkiRakamToplami+sonIkiRakamToplami));
        System.out.println("Sayinin ilk iki rakami ile son iki rakami farki :" + (ilkIkiRakamToplami-sonIkiRakamToplami));

        System.out.println(sonIkiRakamToplami);
        System.out.println(ilkIkiRakamToplami);

    }
}
