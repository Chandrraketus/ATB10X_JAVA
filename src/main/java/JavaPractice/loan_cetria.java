package JavaPractice;

import java.util.Scanner;

public class loan_cetria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter yor salary");
        int salary = sc.nextInt();

        System.out.println("Enter your credit_score ");
        double Credit_Score = sc.nextDouble();

        if(age<18 || age>80){
            System.out.println("your age is not eligible");
            return;
        } else if (salary<30000) {
            System.out.println("We did not give loan under 30000");
            return;
        } else if (Credit_Score <650) {
            System.out.println("Your score is not eligible");
            return;

        }

        else {
            System.out.println("Your loan is approved");

    }

    }
}
