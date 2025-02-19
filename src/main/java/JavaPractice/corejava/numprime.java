package JavaPractice.corejava;

import java.util.Scanner;

public class numprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = sc.nextInt();
        boolean isprime = true;
        if(num<1){
            isprime = false;
        }
        for(int i =2;i<num;i++){
            if(num%i== 2){
                isprime = false;

            }
        }

        if (isprime = true){
            System.out.println("Its a prime number"+ "  " +num);
        }
        else {
            System.out.println("its not a prime number"+num);
        }
    }
}
