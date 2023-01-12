package Ders03;

import java.util.Scanner;

public class C09_Contains {
    public static void main(String[] args) {

        // Kullanicidan bir cumle alin
        // - cumlede GS geciyorsa "Sampiyon Galatasaray"
        // - cumlede FB geciyorsa "Sampiyon Fenerbahce"
        // - ikiside geciyorsa "Sampiyon Besiktas"
        // - hicbirini icermiyorsa "Sampiyon Trabzonspor"yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String girilenCumle = scan.nextLine();
        String yeniCumle=girilenCumle.toLowerCase();

        if (yeniCumle.contains("gs") && yeniCumle.contains("fb")) {
            System.out.println("Sampiyon Besiktas");
        } else if (yeniCumle.contains("gs")) {
            System.out.println("Sampiyon Galatasaray");
        } else if (yeniCumle.contains("fb")) {
            System.out.println("Sampiyon Fenerbahce");
        } else {
            System.out.println("Sampiyon Trabzonspor");
        }
    }
}
