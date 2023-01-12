package Ders04;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {

        // Kullanicidan baslangic ve bitis degerleri alin.
        // Sayilar pozitif tamsayi olsun
        // Sinirlar dahil tum sayilarin toplamini yazdirin
        // baslangic degeri bitis degerinden buyuk olsa da program calissin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degerlerini pozitif tam sayi olarak giriniz");
        int baslangic = scan.nextInt();
        int bitis= scan.nextInt();

        int toplam=0;

        if (baslangic>bitis){
            for (int i = baslangic; i >=bitis ; i--) {
                toplam+=i;
            }
            System.out.println(baslangic+" ve " + bitis + " degerleri arasindaki sayilarin toplami :" + toplam);
        } else {
            for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i;
            }
            System.out.println(baslangic+" ve " + bitis + " degerleri arasindaki sayilarin toplami :" + toplam);

        }
    }
}
