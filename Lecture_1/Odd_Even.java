package Lecture_1;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        System.out.println("Even and odd");
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value of n is : ");
        int n = src.nextInt();
        if(n%2==0){
            System.out.println("This is even number "+n);
        }
        else System.out.println("This is odd number "+n);
    }
}
