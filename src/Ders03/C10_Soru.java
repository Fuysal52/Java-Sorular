package Ders03;

import java.util.Scanner;

public class C10_Soru {
    public static void main(String[] args) {
        // Kullanicidan bir sifre isteyin asagidaki sartlari kontrol edip ve kullaniciya duzeltmesi gereken
        // tum eksikleri soyleyin
        // eger tum sartlar basariyla saglaniyorsa "sifre basariyla kaydedildi"yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 15 karakter olmali
        // - sifre bir ozel bir karakter icermeli *_-

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre = scan.nextLine();

        int flag =0;

        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')) {
            System.out.println("Ilk harf kucuk harf olmali");
            flag++;
        }
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')) {
            System.out.println("Son karakter rakam olmali");
            flag++;
        }
        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");
            flag++;
        }
        if (sifre.length()<15) {
            System.out.println("Sifre en az 15 karakter olmali");
            flag++;
        }
        if (!(sifre.contains("*") || sifre.contains("-") || sifre.contains("_"))) {
            System.out.println("Sifer ozel karakterlerden birini icermeli *,-,_");
            flag++;
        }
        if (flag==0) {
            System.out.println("Sifre basari ile kaydedildi");
        }

    }
}