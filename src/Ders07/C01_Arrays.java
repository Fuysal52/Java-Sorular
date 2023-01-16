package Ders07;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int[] sayilar= { 3,6,9,11};

        System.out.println(Arrays.toString(sayilariArtir(sayilar)));
    }

    public static int[] sayilariArtir (int[] sayilar){

        for (int i = 0; i <sayilar.length ; i++) {

            sayilar[i]+=2;

        }
        return sayilar;
    }
}

