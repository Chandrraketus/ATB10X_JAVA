package JavaPractice;

import java.util.Scanner;

public class HackrankQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Loop to read and print 3 integers
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();  // Read the integer
            System.out.println(num); // Print the integer
        }

        sc.close();
    }
}
