package Ders04;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degerlerini alip
        // bu degerler dahil olup bu sayilar arasinda 5'in kati olan sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini giriniz");
        int baslangic = scan.nextInt();
        System.out.println("Lutfen bitis degerini giriniz");
        int bitis = scan.nextInt();

        int sayilarToplami=0;
        int sayac =0;

        for (int i = baslangic; i <=bitis ; i++) {
            if (i%5==0) {
                sayilarToplami+=i;
                sayac++;
            }
        }
        System.out.println("5'e bolunebilen sayilarin toplami : " + sayilarToplami);
        System.out.println("5'e bolunebilen " + sayac + " tane sayi var");
    }
}
