package Ders07;

import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {

        // Verilen bir array'de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturun

        int[] arr = {2, 3, 4, 2, 5, 2, 6, 7, 4, 5, 1, 2, 4, 6, 3, 1, 9};

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen istediginiz elementi giriniz");
        int arananSayi = scan.nextInt();

        istenenEleman(arr, arananSayi);


    }

    public static void istenenEleman(int[] sayilar, int arananSayi) {

        int sayac = 0;
        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] == arananSayi) {
                sayac++;
            }

        }
        if (sayac == 0) {
            System.out.println("Aranan sayi array'de yok");
        } else {
            System.out.println("Aranan " + arananSayi + " array'de " + sayac + " adet kullanilmistir");
        }
    }
}