package JavaPractice.corejava;

import java.util.Scanner;

public class Name_Vovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        name =name.toLowerCase();
        int vovelcount =0;

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch=='a'||ch=='e'||ch=='o'||ch=='u'){
                vovelcount++;
            }
        }
        System.out.println("number for vovel count" + vovelcount);

        }
    }

