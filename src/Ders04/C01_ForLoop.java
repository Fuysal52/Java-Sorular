package Ders04;

public class C01_ForLoop {
    public static void main(String[] args) {

        // 100'dan 0'a kadar 13'e tam bolunebilen sayilari ve toplamlarini yazdiriniz

        int toplam=0;


        for (int i = 100; i >0 ; i--) {
            if (i%13==0) {
                System.out.println(i + " sayisi 13'e tam bolunur");
                toplam += i;
            }

        }
        System.out.println("13'e bolunen sayilarin toplami : " + toplam);
    }
}
