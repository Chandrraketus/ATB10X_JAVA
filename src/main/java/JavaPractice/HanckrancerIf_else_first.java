package JavaPractice;

import java.util.Scanner;

public class HanckrancerIf_else_first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n%2 !=0){
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5)  {
            System.out.println("Not Weird");
        } else if (n>=6 && n<=20) {
            System.out.println("Weird");
            
        } else if (n>20) {
            System.out.println("Not Weird");
            
        }

        sc.close();
    }

}
