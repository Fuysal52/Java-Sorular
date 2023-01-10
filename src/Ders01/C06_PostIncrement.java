package Ders01;

public class C06_PostIncrement {
    public static void main(String[] args) {
        // Asagidaki soruda output ne olur?

        int num1=9;

        int num2= num1++; // num2=9 --- num1=10

        if(num2 < 10){
            System.out.println(num2 + " Hello World");
        } else {
            System.out.println(num1 + " Hello Universel");
        }
    }

} // output ..... 9 Hello World

