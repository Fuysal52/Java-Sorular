package Ders04;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {

        // Girilen bir String'deki a harfi sayisini bulunuz ama c harfine gelirse donguden cikilsin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine().toUpperCase();

        int sayac=0;

        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)=='A') {
                sayac++;
            }
            if (cumle.charAt(i)=='C') {
                break;
            }

        }
        System.out.println(cumle + "-->" + sayac);
    }

}
