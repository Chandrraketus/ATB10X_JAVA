package JavaPractice.encapsulation;

public class icicibank{
    public static void main(String[] args) {

    }

    private String name;
    private long balance;
    public String bankname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isCashier) {
        this.balance = balance;
    }

    public icicibank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public void setBal(long balance,boolean isCashier){
        if(isCashier) {
            this.balance = balance;
        }
        else {
            System.out.println("Not allowed to change");
        }
    }





}
