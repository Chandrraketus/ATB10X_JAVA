package JavaPractice;

import java.util.Scanner;

public class factorialofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        int factorial = 1;

        for(int i = 1;i<=num;i++){
            factorial*=i;

        }
        System.out.println(factorial);
    }
}
