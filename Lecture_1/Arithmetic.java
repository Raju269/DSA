package Lecture_1;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.println("Arithmatic calculation ");
        Scanner src = new Scanner(System.in);
        int num1 = src.nextInt();
        int num2 = src.nextInt();
        int sum = (num1+num2);
        int sub = (num1-num2);
        int mul = (num1*num2);
        int div = (num1/num2);
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
}
