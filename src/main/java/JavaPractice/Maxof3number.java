package JavaPractice;

public class Maxof3number {
    public static void main(String[] args) {
        int n1=5,n2 =8,n3 =9;

        int largest = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
        System.out.println("largest number is "+" "+ largest);

    }
}
