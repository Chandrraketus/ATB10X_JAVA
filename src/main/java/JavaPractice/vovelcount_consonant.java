package JavaPractice;

import java.util.Scanner;

public class vovelcount_consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();
        int vovelcount =0;
        int consonant =0;
        name = name.toLowerCase();
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch =='a'|| ch == 'e'|| ch=='i'|| ch=='o'|| ch=='u'){
                vovelcount++;

            } else if (ch>'a' && ch<'z') {
                consonant++;

            }
        }
        System.out.println("Number of vovel : " + vovelcount );
        System.out.println("Number of consonat : " + consonant );

    }

}
