package Ders02;

import java.util.Scanner;

public class C04_NestedIfElseStatements {
    public static void main(String[] args) {

        // boy uzunluklari bilinen 3 ogrencinin boy uzunluklarini aliniz
        // en uzun olan ogrenciyi bulunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ogrencilerin boy uzunluklarini giriniz");

        int ogrenci1 = scan.nextInt();
        int ogrenci2 = scan.nextInt();
        int ogrenci3 = scan.nextInt();

        if (ogrenci2 == ogrenci1 && ogrenci2 == ogrenci3) {
            System.out.println("Tum ogrencilerin boylari aynidir");

        } else if (ogrenci1 > ogrenci2) {
            if (ogrenci1 > ogrenci3) {
                System.out.println("1. Ogrencinin boyu " + ogrenci1 + " ile en uzundur");
            } else if (ogrenci1 == ogrenci3) {
                System.out.println("1. Ogrenci ve 3. ogrencinin boylari esit ve en uzundur");
            } else {
                System.out.println("3. Ogrencinin boyu " + ogrenci3 + " ile en uzundur");
            }
        } else if (ogrenci2 == ogrenci1) {
            if (ogrenci1 > ogrenci3) {
                System.out.println("1. Ogrenci ve 2. ogrencinin boylari esit ve en uzundur");
            } else {
                System.out.println("3. Ogrencinin boyu " + ogrenci3 + " ile en uzundur");
            }

        } else {
            if (ogrenci2 > ogrenci3) {
                System.out.println("2. Ogrencinin boyu " + ogrenci2 + " ile en uzundur");
            } else if (ogrenci2 == ogrenci3) {
                System.out.println("2. Ogrenci ve 3. ogrencinin boylari esit ve en uzundur");
            } else {
                System.out.println("3. Ogrencinin boyu " + ogrenci3 + " ile en uzundur");
            }
        }
    }
}
