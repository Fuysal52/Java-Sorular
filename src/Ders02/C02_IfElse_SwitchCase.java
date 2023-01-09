package Ders02;

import java.util.Scanner;

public class C02_IfElse_SwitchCase {
    public static void main(String[] args) {

        // Kullanicidan 2 tam sayi alin
        // Kullanicidan bir islem cinsi alin
        // 1- toplama , 2- cikarma , 3- carpma 4- bolme
        // ve sayilari kullanicinin belirledigi isleme tabi tutun

        Scanner matematik = new Scanner(System.in);
        System.out.println("Lutfen 2 tam sayi giriniz");
        int girilenSayi1= matematik.nextInt();
        int girilenSayi2= matematik.nextInt();

        System.out.println("Lutfen istediginiz islemi seciniz");
        System.out.println("Toplama Icin: 1\nCikarma Icin: 2\nCarpma Icin : 3\nBolme  Icin : 4");
        int secilenIslem= matematik.nextInt();

        if (secilenIslem==1) {
            System.out.println("Sonuc : " + (girilenSayi1+girilenSayi2));
        } else if (secilenIslem==2) {
            System.out.println("Sonuc : " + (girilenSayi1-girilenSayi2));
        } else if (secilenIslem==3) {
            System.out.println("Sonuc : " + (girilenSayi1*girilenSayi2));
        } else if (secilenIslem==4) {
            if (girilenSayi2==0) {
                System.out.println("0'a bolum tanimsizdir");
            } else {
                System.out.println("Sonuc :" + ( girilenSayi1/girilenSayi2));
            }

        } else {
            System.out.println("Yanlis islem girisi yapildi");
        }


        // Switch case cozumu

        switch (secilenIslem) {
            case 1 :
                System.out.println("Sonuc :" + (girilenSayi1+girilenSayi2)); break;
            case 2 :
                System.out.println("Sonuc :" + (girilenSayi1-girilenSayi2)); break;
            case 3 :
                System.out.println("Sonuc :" + (girilenSayi1*girilenSayi2)); break;
            case 4 :
                if (girilenSayi2==0) {
                System.out.println("0'a bolum tanimsizdir");
            } else {
                System.out.println("Sonuc :" + ( girilenSayi1/girilenSayi2));
            } break;
            default:
                System.out.println("Yanlis islem secimi yaptiniz, lutfen tekrar deneyiniz");
        }
    }
}
