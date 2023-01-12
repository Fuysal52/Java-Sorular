package Ders03;

import java.util.Scanner;

public class C07_LastIndexOf {
    public static void main(String[] args) {

        // Kullanicidan bir cumle aliniz
        // cumlede gecen 2. bir kelimesinin indexini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();

        int ilkBir= cumle.indexOf("bir");
        System.out.println(ilkBir);
        System.out.println(cumle.indexOf("bir",ilkBir+1));
    }
}
