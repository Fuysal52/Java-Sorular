package Ders05;

public class C03_DikUcgeninAlani_Cevresi {
    public static void main(String[] args) {

        dikUcgenAlani(6,3);
        dikUcgeninCevresi(4,3,5);


    }

    public static void dikUcgenAlani (int yukseklik, int taban ) {

        System.out.println("Dik ucgenin alani: " +(yukseklik*taban)/2);
    }

    public static void dikUcgeninCevresi (int yukseklik , int taban, int hipotenus) {

        System.out.println("Dik ucgenin cevresi : " + (yukseklik+taban+hipotenus));
    }

}
