package Ders03;

import java.util.Scanner;

public class C02_BolmeMethoduOlusturma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bolmek istediginiz sayiyi giriniz");
        int a = scan.nextInt();

        System.out.println("Lutfen bolen sayiyi giriniz");
        int b = scan.nextInt();

        System.out.println(a +  "/"  + b + "="   + bol(a, b));
        System.out.println(bol(3,2));
        System.out.println(bol(45,6));
    }

    public static int bol(int bolunen, int bolen) {
        int bolum =0 ;
        while (bolunen>=bolen) {

            bolunen-=bolen;
            bolum++;
        }
        return bolum;

    }
}
