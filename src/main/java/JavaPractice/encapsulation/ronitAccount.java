package JavaPractice.encapsulation;

public class ronitAccount {
    public static void main(String[] args) {
        icicibank ronit = new icicibank("Ronit",780);
        System.out.println(ronit.getBalance());

        boolean isCashier = true;
        ronit.setBalance(100,isCashier);
        System.out.println(ronit.getBalance());
    }
}
