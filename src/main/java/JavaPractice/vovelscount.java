package JavaPractice;

import java.util.Scanner;

public class vovelscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter your string");
        String name = sc.nextLine();
        name = name.toLowerCase();

        int vaovelcount=0;

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='o'||ch=='i'||ch=='u'){
                vaovelcount++;
            }


        }
        System.out.println(" Total number of vovel count  = "+vaovelcount);




    }
}
