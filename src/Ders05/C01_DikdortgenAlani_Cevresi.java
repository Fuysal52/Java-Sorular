package Ders05;

public class C01_DikdortgenAlani_Cevresi {
    public static void main(String[] args) {

        dikdortgenAlani(3,5);
        dikdortgenCevresi(3,6);

    }

    public static void dikdortgenAlani(int kenar1, int kenar2) {

        System.out.println("Dikdortgenin alani: " + (kenar1*kenar2));
    }

    public static void dikdortgenCevresi (int kenar1 , int kenar2) {

        System.out.println("Dikdortgenin cevresi : " + (kenar1+kenar2)*2);
    }


}
