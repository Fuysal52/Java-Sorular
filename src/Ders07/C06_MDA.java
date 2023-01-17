package Ders07;

public class C06_MDA {
    public static void main(String[] args) {

        // verilen 2 katli bir array'de bulunan cift sayilari toplayip
        // sonucu yazdiran bir method olusturun

        int[][] arr = {{8,1,2,4},{1,2},{32,41,5},{10},{12,7}};
        ciftSayilarToplami(arr);
    }

    public static void ciftSayilarToplami (int[][] arr) {

        int toplam = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j]%2==0){
                    toplam+=arr[i][j];
                }
            }
        }
        System.out.println("Array'deki cift sayilarin toplami : " + toplam);

    }
}
