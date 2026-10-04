package Lecture_1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Task1");
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        if(n>=100 && n<200){
            System.out.println("Your win Bike");
            if(n<=150){
                System.out.println("your win hero bike");
            }
            else System.out.println("Your win ktm");
        }
        else if (n>=283 && n<=473){
            System.out.println("Your win macebook");
              if(n>=473){
                System.out.println("your win hero m2");
            }            else System.out.println("Your win m1");

        }
         else if (n>=50 && n<=93){
            System.out.println("Your win cycle");
              if(n>=93){
                System.out.println("your win hero Avon cycle");
            }            else System.out.println("Your win atlas cycle");

        }
          else if (n>=789 && n<=989){
            System.out.println("Your win   kurture");
              if(n>=989){
                System.out.println("your win hero blue kurture");
            }            else System.out.println("Your win red kurture");

        }
          else System.out.println("Better lucky next time");
    }
}
