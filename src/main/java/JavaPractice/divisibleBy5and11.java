package JavaPractice;

import java.util.Scanner;

public class divisibleBy5and11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : -> ");
        int num = sc.nextInt();

        if(num%5==0 && num%11==0) {
            System.out.println("divisible by both 5 and 11");
        }

        else if(num%5==0){
            System.out.println("its divisible by 5");


        } else if (num%11==0) {
            System.out.println("divisible by 11");

        } else {
            System.out.println("not from 5 and 11");
        }
    }
}
