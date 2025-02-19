package JavaPractice.corejava;

import java.util.Scanner;

public class evennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        int evensum =0;

        for(int i =1;i<num;i++){
            if(i%2==0){
                System.out.println("its even"+ i);
                evensum+=i;
            }


        }
        System.out.println("Sum of evennumber "+evensum);
    }
}
