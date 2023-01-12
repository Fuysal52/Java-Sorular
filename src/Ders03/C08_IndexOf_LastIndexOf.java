package Ders03;

public class C08_IndexOf_LastIndexOf {
    public static void main(String[] args) {
        // 1-48 of over 6,000 results for "parfum"
        // arama sonucunda 5000 den fazla sonuc cikip cikmadigini kontrol edin

        String input = "1-48 of over 6,000 results for \"parfum\"";

        int overIndex = input.indexOf("over");
        int resultsIndex = input.indexOf("results");

        String sonucString = input.substring(overIndex + 5, resultsIndex - 1);
        sonucString = sonucString.replace(",", "");
        int sonucInt = Integer.parseInt(sonucString);

        if (sonucInt > 5000) {
            System.out.println("Rarfum arama sonucu PASSED");
        } else {
            System.out.println("Parfum arama sonucu FAILED");
        }
    }
}
