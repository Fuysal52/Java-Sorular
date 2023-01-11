package Ders03;

public class C04_Test {
    public static void main(String[] args) {

        // 1-16 of over 9,000 results for "computer" internet aramasinda kac sonuc ciktigini yazdirin

        String input = "1-16 of over 90 results for \"computer\"";

        int indexOver = input.indexOf("over");
        int indexresults = input.indexOf("results");


        String sonucString = input.substring(indexOver+5,indexresults-1);
        int sonucInt = Integer.parseInt(sonucString);
        System.out.println("Cikan sonuc sayisi : " + sonucInt);
    }
}
