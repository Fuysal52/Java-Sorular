package Ders02;

import java.util.Scanner;

public class C03_NestedIfElseStatements {
    public static void main(String[] args) {

        // Girilen notun harf karşılığını bulma
        //  Girilen not;
        // 60 ile 65 arasındaysa DD
        // 65 ile 70 arasındaysa DC
        // 70 ile 75 arasındaysa CC
        // 75 ile 80 arasındaysa CB
        // 80 ile 85 arasındaysa BB
        // 85 ile 90 arasındaysa BA
        //90 ile 100 arasındaysa AA
        // yazdıran bir program yazalım. Bunların dışındaysa
        // «Uygun değer girmediniz!» şeklinde uyarı verip, programdan çıkacak.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();

        if (not<60 || not>100) {
            System.out.println("Uygun deger girmediniz!");
        } else if (not>=60 && not<65) {
            System.out.println("Notunuz DD");
        } else if (not>=65 && not<70) {
            System.out.println("Notunuz DC");
        } else if (not>=70 && not<75) {
            System.out.println("Notunuz CC");
        } else if (not>=75 && not<80) {
            System.out.println("Notunuz CB");
        } else if (not>=80 && not<85) {
            System.out.println("Notunuz BB");
        } else if (not>=85 && not<90) {
            System.out.println("Notunuz BA");
        } else if (not>=90 && not<=100) {
            System.out.println("Notunuz AA");
        }
    }
}
