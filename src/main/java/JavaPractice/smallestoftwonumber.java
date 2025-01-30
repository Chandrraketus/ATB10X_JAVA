package JavaPractice;

import java.util.Scanner;

public class smallestoftwonumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
         int a = sc.nextInt();
         int b = sc.nextInt();

         if(a<b){
             System.out.println("a is smallest number : " + a);
         }
         else {
             System.out.println("b is smallest number : " + b);
         }
    }
}
