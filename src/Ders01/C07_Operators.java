package Ders01;

import java.util.Scanner;

public class C07_Operators {
    public static void main(String[] args) {
        // Kullanicidan bir pozitif tam sayi aliniz
        // Sayi hem 3 hem 5 e bolunebiliyorsa " Bildiniz"yazdirin
        // ikisinden birine tam bolunebiliyorsa "Yaklastiniz"yazdirin
        // ikisinide bolunemiyorsa "Tekrar deneyin"yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz = ");
        int sayi = scan.nextInt();

        if (sayi%3==0 && sayi%5==0) {
            System.out.println("Bildiniz");
        } else if (sayi%3==0 || sayi%5==0) {
            System.out.println("Yaklastiniz");
        } else {
            System.out.println("Tekrar deneyiniz");
        }
    }
}
