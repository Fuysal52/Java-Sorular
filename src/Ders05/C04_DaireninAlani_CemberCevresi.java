package Ders05;

public class C04_DaireninAlani_CemberCevresi {
    public static void main(String[] args) {

        daireAlani(2);
        cemberinCevresi(3);

    }
    public static void daireAlani (double yariCap) {

        System.out.println("Dairenin alani: " + yariCap*yariCap*3.14);
    }

    public static void cemberinCevresi ( double yariCap) {

        System.out.println("Cemberin cevresi : " + (2*3.14*yariCap));
    }
}
