package JavaPractice;

public class stringvalue {
    public static void main(String[] args) {
        String intro= "My naame chandraketu";
        int count =0;

        for(int i=0;i<intro.length();i++){
            if(Character.isLetter(intro.charAt(i)))
                count++;
            System.out.println(count);

        }



    }
}
