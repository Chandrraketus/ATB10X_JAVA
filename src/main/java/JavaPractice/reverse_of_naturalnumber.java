package JavaPractice;

import java.util.Scanner;

public class reverse_of_naturalnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();

        for(int i =n;i>0;i--){
            System.out.println("Reverse of number " + i);
        }



    }
}
