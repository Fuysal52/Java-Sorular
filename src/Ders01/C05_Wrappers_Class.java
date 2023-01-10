package Ders01;

import java.util.Scanner;

public class C05_Wrappers_Class {
    public static void main(String[] args) {

        // Kullanicidan alinan 5 basamakli bir sayinin yuzler basamagini bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz = ");
        int sayi = scan.nextInt();

        int yuzlerBasamagi=0;

        sayi=sayi/100;
        yuzlerBasamagi=sayi%10;
        System.out.println("Girilen sayinin yuzler basamagi :" + yuzlerBasamagi);
    }
}
