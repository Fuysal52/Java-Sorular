package Ders07;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        // Verilen bir array'deki tum elementleri bir saga kaydirip
        // Sondaki elementi de basa tasiyacak bir method olusturun.
        // Array'i yeni haliyle kaydedin

        int[] sayilar = {12,2,53,14};

        sayilar=elementleriSagaKaydir(sayilar);
        System.out.println(Arrays.toString(sayilar));

    }
    public static int[] elementleriSagaKaydir ( int[] sayilar){

        int temp = sayilar[sayilar.length-1];

        for (int i = sayilar.length-1; i >=1 ; i--) {
            sayilar[i]=sayilar[i-1];
        }
        sayilar[0]=temp;

        return sayilar;
    }
}
