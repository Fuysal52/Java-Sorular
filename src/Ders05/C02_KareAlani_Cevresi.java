package Ders05;

public class C02_KareAlani_Cevresi {
    public static void main(String[] args) {

        kareAlani(3);
        kareCevresi(5);

    }

    public static void kareAlani (int kenar) {

        System.out.println("Karenin alani: " + kenar*kenar);
    }

    public static void kareCevresi (int kenar) {

        System.out.println("Karenin cevresi : " + kenar*4);
    }
}
