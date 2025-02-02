package JavaPractice;

import java.util.Scanner;

public class multiplicationoftableusingforlloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int num = sc.nextInt();

        System.out.println("Multiplication of table " + num +":");
        for(int i=1;i<=10;i++){
            System.out.println(num + "X" + i + " = " + (num*i));
        }
    }
}
