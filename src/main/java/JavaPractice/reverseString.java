package JavaPractice;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        String reversed ="";

        for(int i =name.length()-1;i>=0;i--){
            reversed += name.charAt(i);

        }
        System.out.println("revese of your name is : " + reversed);
    }
}
