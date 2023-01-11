package Ders03;

import java.util.Scanner;

public class C03_StringManipulations {
    public static void main(String[] args) {

        // Kullanicidan bir mail alin
        // - mail @gmail.com icermiyorsa "mail gmail olmali
        // - mail @gmail.com ile bitmiyorsa "mailde yazim hatasi var"
        // - mail uzunlugu 25 karakterden az ise "Daha uzun bir mail secin"
        // - mail'in ilk harfi buyukse "Mail kucuk harf ile baslamali " yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir mail adresi giriniz");
        String mail= scan.nextLine();

        if (!mail.contains("@gmail.com")) {
            System.out.println("Mail gmail olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("Mailde yazim hatasi var");
        } else if (mail.length()<25) {
            System.out.println("Daha uzun bir mail secin");
        } else if (mail.charAt(0)>='A' && mail.charAt(0)<='Z') {
            System.out.println("Mail kucuk harf ile baslamali");
        }
    }
}
