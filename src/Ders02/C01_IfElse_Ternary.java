package Ders02;

import java.util.Scanner;

public class C01_IfElse_Ternary {
    public static void main(String[] args) {
        // Kullanicidan bir sayi aliniz
        // sayi 0'dan buyuk ve esit ise 10 dan kucuk olup olmadigini kontrol ediniz
        // 10 dan kucuk ise "Rakam"yazdirin degilse "pozitif sayi "yazdirin
        // sayi 0 dan kucuk ise "negatif sayi"yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi= scan.nextInt();

        // if cozumu

        if (girilenSayi>=0){
            if (girilenSayi<10){
                System.out.println("Girilen sayi bir rakamdir");
            } else {
                System.out.println("Girilen sayi bir pozitif sayidir");
            }
        } else {
            System.out.println("Girilen sayi bir negatif sayidir");
        }

        // Ternary Cozumu

        System.out.println((girilenSayi>=0)?((girilenSayi<10) ? "Girilen sayi bir rakamdir":"Girilen sayi pozitif bir sayidir"):
                ("Girilen sayi negatif bir sayidir"));


    }
}
