package JavaPractice;

import java.util.Scanner;

public class Smallest_of_three_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a<b && a<c){
            System.out.println(" a is smallest number " + a);
        } else if (b<a && b<c){
            System.out.println("b is smallest number" + b);

        }

        else {
            System.out.println("C is smallest number" + c);
        }
    }
}
