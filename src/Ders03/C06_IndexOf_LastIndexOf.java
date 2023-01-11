package Ders03;

import java.util.Scanner;

public class C06_IndexOf_LastIndexOf {
    public static void main(String[] args) {

        // Kullanicidan bir cumle alin
        // Cumlede "bir"kelimesi yoksa "Bir "kelimesi kullanilmamis
        // bir kere kullanilmis ise "bir kere kullanilmis"
        // birden fazla ise "birden fazla kullanilmis"yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();

        int ilkBir = cumle.indexOf("bir");
        int sonBir = cumle.lastIndexOf("bir");

        if (!cumle.contains("bir")){
            System.out.println("Cumlede 'bir' kelimesi kullanilmamis");
        } else if (ilkBir==sonBir) {
            System.out.println("Cumlede 'bir'kelimesi 1 kere kullanilmis");
        } else {
            System.out.println("Cumlede 'bir' kelimesi birden fazla kullanilmis");
        }
    }
}
