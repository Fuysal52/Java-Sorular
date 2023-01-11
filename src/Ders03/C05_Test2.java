package Ders03;

public class C05_Test2 {
    public static void main(String[] args) {

        // 1-48 of 420 results for "findik" internet aramasinda cikan sonuc
        // arama sonucunun 500 den fazla oldugunu test edin

        String input = "1-48 of 420 results for \"findik\"";

        int indexOf=input.indexOf("of");
        int indexResults = input.indexOf("results");

        String sonucString = input.substring(indexOf+3,indexResults-1);
        int sonucInt=Integer.parseInt(sonucString);

        if (sonucInt>=500) {
            System.out.println("Findik testi PASSED");
        } else {
            System.out.println("Istene kadar sonuc yok, Findik arama testi FAILED");
        }
    }
}

