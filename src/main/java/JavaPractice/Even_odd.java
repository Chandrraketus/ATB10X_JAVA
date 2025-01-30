package JavaPractice;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        String result = (a%2==0)?"even":"odd";
        System.out.println("number is even_odd" +" "+ result);
    }
}
