package JavaPractice;

import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you meter reading");
        int reading = sc.nextInt();

        if(reading >0 && reading <100) {
            System.out.println("your elctric_bill is : " + reading * 0.5);
            return;
        }
        else if (reading > 101 && reading <200) {
            System.out.println("Your electric_bill is : " + reading *0.75 +"Rs");
            return;
        }
        else if (reading > 201 && reading <300) {
            System.out.println("Your electric_bill is : " + reading * 1.20 + "Rs");
            return;
        }

        else if(reading>300){
            System.out.println("Your electric_bill is :" + " " + reading*1.50);
            return;
        }


    }
}
