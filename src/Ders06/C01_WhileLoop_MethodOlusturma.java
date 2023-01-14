package Ders06;

import java.util.Scanner;

public class C01_WhileLoop_MethodOlusturma {
    public static void main(String[] args) {

        // Kullanicidan bir String alin ve String'in icindeki rakamlarin rakamlar toplamini bulan
        // bir method olusturun.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir String ifade giriniz");
        String str= scan.nextLine();

        rakamlarToplami(str);


    }
    public static void rakamlarToplami (String str) {

        str=str.replaceAll("\\D","");
        int sayi=Integer.parseInt(str);

        int birlerbasamagi = 0;
        int rakamlarToplami=0;

        while (sayi>0) {

            birlerbasamagi=sayi%10;
            rakamlarToplami+=birlerbasamagi;
            sayi=sayi/10;
        }
        System.out.println("String ifadenin icindeki rakamlarin degerler toplami:" + rakamlarToplami);
    }
}
