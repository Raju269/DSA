package Lecture_1;

import java.util.Scanner;

public class Simple_Interested {
    public static void main(String[] args) {
        System.out.println("Simple Interested ");
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value of Rate is ");
        int rate = src.nextInt();
        System.out.println("Enter the value of principle is ");
        int prinicple = src.nextInt();
        System.out.println("Enter the value of time is ");
        int time = src.nextInt();
        int simpleInterested = (prinicple*rate*time)/100;
        System.out.println("Simple interested is : "+simpleInterested);
    }
}
