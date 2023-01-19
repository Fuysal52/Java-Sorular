package Ders08;

import Ders05.C06_FibonacciMethodu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_ArrayList {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alip , o tamsayidan kucuk  Fibonacci sayilarini bir liste
        // olarak bize donduren bir method olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scan.nextInt();

        C06_FibonacciMethodu.fibonaccidenSayiYazdir(girilenSayi);

    }
    public static List<Integer> fibonacciListesi (int sayilar) {

        List<Integer> fibonacciList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scan.nextInt();

        for (int i = 1; i <=girilenSayi ; i++) {



        }
        return fibonacciList;

    }
}
