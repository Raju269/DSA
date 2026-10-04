package Lecture_1;

import java.util.Scanner;

public class MarksQuestion {
    public static void main(String[] args) {
        System.out.println("Greater marks ");
        Scanner src = new Scanner(System.in);
        System.out.println("Enter your marks is :");
        int n = src.nextInt();
        if(n<=100 && n>75){
            System.out.println("Your Marks is A ");
        }
        else if (n<=75 && n>65){
            System.out.println("Your marks is B ");
        }
         else if ((n<=65 && n>55)){
            System.out.println("Your marks is C ");
        }
          else if ((n<=55 && n>45)){
            System.out.println("Your marks is D ");
        }
          else System.out.println("Your are fail");
    }
}
