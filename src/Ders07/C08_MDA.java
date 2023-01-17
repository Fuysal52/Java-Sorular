package Ders07;

public class C08_MDA {
    public static void main(String[] args) {
        // verilen 2 katli bir array'de her bir inner array'in son elementlerinin
        // toplamini yazdiran bir method olusturun

        int [][] arr = {{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};
        sonElementlerinToplami(arr);

    }
    public static void sonElementlerinToplami (int[][] arr) {

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = arr[i].length-1; j <=arr[i].length-1 ; j++) {

                toplam+=arr[i][j];
            }
        }
        System.out.println("Inner array'in son elementlerinin toplami : " +toplam);
    }
}
