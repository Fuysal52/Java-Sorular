package Ders03;

import java.util.Scanner;

public class C01_DikUcgen {
    public static void main(String[] args) {

        // kULLANICIDAN BIR UCGENIN 3 KENAR UZUNLUGUNU ALIN
        // Bu kenarlarin bir dik ucgene ait olup olmadigini hesaplatan bir kod yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin birinci kenar uzunluklugunu giriniz");
        int a = scan.nextInt();
        System.out.println("Lutfen ucgenin ikinci kenar uzunluklugunu giriniz");
        int b = scan.nextInt();
        System.out.println("Lutfen ucgenin ucuncu kenar uzunluklugunu giriniz");
        int c = scan.nextInt();

        if(((a*a)+(b*b)==c*c) || ((a*a)+(c*c)==(b*b)) || ((b*b)+(c*c)==(a*a))) {
            System.out.println("Bu bir dik ucgendir");
        } else {
            System.out.println("Bu bir dik ucgen degildir");
        }
    }
}
