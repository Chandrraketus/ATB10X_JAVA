package JavaPractice;

import java.util.Scanner;

public class forloopEvenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the value of n");
        int n = sc.nextInt();
        int evensum =0;
        int oddsum=0;

        for(int i = 0;i<=n;i++){
            if(i%2==0){
                System.out.println( i+" " + "Even number" );
                evensum += i;
            }

            else {
                System.out.println(i+ " " + "odd number"  );
                oddsum+=i;

            }
        }
        System.out.println("Sum of all even numbers between 0 and " + n + " is: " + evensum);
        System.out.println("Sum of all even numbers between 0 and " + n + " is: " + oddsum);


    }
}
