package Lecture_1;

import java.util.Scanner;

public class MaximumTwonumber {
    public static void main(String[] args) {
        System.out.println("Maximum number");
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value of a is :");
        int a = src.nextInt();
        System.out.println("Enter the value of b is :");
        int b = src.nextInt();
        System.out.println("Enter the value of c is : 2");
        int c = src.nextInt();
        if(a>b&&a>c){
            System.out.println("A is greater than b and c ");
        }
        else if(b>c &&b>a){
            System.out.println("B is greater than a and c ");
        }
        else {
            System.out.println("C is greater than a and b ");
        }
    }
}
