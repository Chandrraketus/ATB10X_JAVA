package JavaPractice.corejava;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your number");
        int num = sc.nextInt();
        boolean isprime = true;
        if(num<=0){
            isprime = false;

        }
        for(int i =2;i<num;i++){
            if(num%i==0){
                isprime = false;
            }



        }
        if(isprime){
            System.out.println(num+"is prime");
        }
        else {
            System.out.println(num+"not prime number");
        }

    }
}
