package JavaPractice;

import java.util.Scanner;

public class Employee_Bonous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year of experience");
        float experience = sc.nextFloat();

        System.out.println("Enter your salary");
        double salary = sc.nextDouble();

        if (experience < 1){
            System.out.println("Yor exp is not for bonous");
        } else if (experience >=1 && experience <=3) {
            int bonous = (int) ((salary*5)/100);
            System.out.println("Your bonous is 5% of your salary" +  " " +(salary*5)/100);
            System.out.println("Total salary" +":-> "+ (salary+bonous));
            return;

        } else if (experience >=4 && experience <=6) {
            int bonous = (int) ((salary*10)/100);
            System.out.println("Your bonous is 10% of your salary" +  " " +(salary*10)/100);
            System.out.println("Total salary" +":-> "+ (salary+bonous));
            return;

        } else if (experience >6){
            int bonous = (int) ((salary*15)/100);
            System.out.println("Your bonous is 15% of your salary" +  " " +(salary*10)/100);
            System.out.println("Total salary" +":-> "+ (salary+bonous));


        }


    }
}
