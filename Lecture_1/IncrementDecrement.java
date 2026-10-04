package Lecture_1;

import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("Task1");
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        if(n>=100 && n<200){
            System.out.println("Your win Bike");
        }
        else if (n>=283 && n<=473){
            System.out.println("Your win macebook");
        }
         else if (n>=50 && n<=93){
            System.out.println("Your win macebook");
        }
          else if (n>=789 && n<=989){
            System.out.println("Your win kurture");
        }
          else System.out.println("Better lucky next time");
    }
}
