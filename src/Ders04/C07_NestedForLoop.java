package Ders04;

import java.util.Scanner;

public class C07_NestedForLoop {
    public static void main(String[] args) {

        // Kullanicidan cizmek istedigi kare veya dikdortgen modelinin
        // kisa ve uzun kenar olculaerini alin ve
        // * ile bu sekli cizin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kenar uzunluklarini tam sayi olarak giriniz");

        int kisaKenar= scan.nextInt();
        int uzunKenar= scan.nextInt();

        for (int i = 1; i <=kisaKenar ; i++) {
            for (int j = 1; j <=uzunKenar ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
