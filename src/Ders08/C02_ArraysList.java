package Ders08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_ArraysList {
    public static void main(String[] args) {
        // Kullanicidan alinan bir pozitif tamsayinin tam bolebilen pozitif tamsayilarini
        // bize donduren bir liste seklide method olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scan.nextInt();

        if (girilenSayi<0){
            System.out.println("Pozitif bir tam sayi giriniz");
        } else if (girilenSayi==0) {
            System.out.println("0'in boleni yok, daha buyuk bir sayi giriniz");
        } else {
            List<Integer> tamBolenlerListesi =tamBolenlerListesi(girilenSayi);
            System.out.println(tamBolenlerListesi);

        }
    }
    public static List<Integer> tamBolenlerListesi (int girilenSayi){

        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <=girilenSayi ; i++) {

            if (girilenSayi%i==0){
                tamBolenlerListesi.add(i);
            }
        }
        return tamBolenlerListesi;
    }
}
