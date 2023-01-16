package Ders07;

public class C03_Arrays {
    public static void main(String[] args) {

        // Verilen String array'deki en uzun en kisa kelimeleri yazdiran bir method olusturun

        String[] kelimeler = {"Ali", "Deve", "Galatasaray", "Ok","Gala","a"};
        enUzunEnKisaKelime(kelimeler);

    }
    public static void enUzunEnKisaKelime (String[] kelimeler){

        int enUzunKelime = kelimeler[0].length();
        int enKisaKelime = kelimeler[0].length();

        String uzunKelime = kelimeler[0];
        String kisaKelime = kelimeler[0];


        for (int i = 0; i <kelimeler.length ; i++) {


            if (enUzunKelime < kelimeler[i].length()) {
                uzunKelime = kelimeler[i];
            }

            if (enKisaKelime > kelimeler[i].length()) {
                kisaKelime = kelimeler[i];
            }
        }
        System.out.println("En kisa kelime :" + kisaKelime );
        System.out.println("En uzun kelime :" + uzunKelime );
    }
}
