package Ders07;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        // verilen array'i buyukten kucuge siralayan bir method olusturun

        String[] isimler = { "Huseyin", "Yusuf","ahmet"};



        System.out.println(Arrays.toString(buyuktenKucugeSiralama(isimler))); // [ahmet, Yusuf, Huseyin]
    }
    public static String[] buyuktenKucugeSiralama ( String[] isimler){

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));
        String[] temp = new String[isimler.length];


        for (int i = isimler.length-1; i >=0 ; i--) {

            temp[temp.length-1-i]=isimler[i];
        }
        return temp;
    }
}
