package Ders04;

import java.util.Scanner;

public class C04_MukemmelSayi {
    public static void main(String[] args) {

        // Bir sayinin mukemmel sayi olup olmadigini yazan bir method yazin
        // mukemmel sayi: bir sayinin kendisi haric bolenlerinin toplami kendisine esitse o sayi mukemmeldir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        mukemmelSayi(sayi);
    }

    public static void mukemmelSayi(int sayi) {
        int toplam=0;
        for (int i = 1; i <sayi ; i++) {

            if (sayi%i==0) {
                toplam+=i;
            }
        }
        if (toplam==sayi) {
            System.out.println("Mukemmel sayidir");;
        } else {
            System.out.println("Mukemmel sayi degildir");
        }
    }
}