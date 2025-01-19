package JavaPractice;

public class Even_odd {
    public static void main(String[] args) {
        int a =Integer.parseInt(args[0]);
        String result = (a%2==0)?"even":"odd";
        System.out.println("number is even_odd" +" "+ result);
    }
}
