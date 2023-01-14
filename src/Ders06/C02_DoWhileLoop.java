package Ders06;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        int a = 12;
        int b = 3;
        int x = 0;

        do {
            b++;
            a-=2;
            x+= a+b;
        } while (a>b);
        System.out.println(x);
    }
}
