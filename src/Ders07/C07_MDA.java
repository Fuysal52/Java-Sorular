package Ders07;

public class C07_MDA {
    public static void main(String[] args) {

        // Verilen 2 katli bir array'deki tum sayilarin carpimini bize donduren bir method olusturun

        int [][] arr = {{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};
        System.out.println("Array'deki sayilarin carpimi: " + sayilarCarpimi(arr));
    }
    public static int sayilarCarpimi(int[][] arr){

        int carpim=1;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

               carpim*=arr[i][j];
            }

        } return carpim;
    }
}
