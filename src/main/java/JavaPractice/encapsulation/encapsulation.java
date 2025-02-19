package JavaPractice.encapsulation;

public class encapsulation {
    public static void main(String[] args) {

    login lo = new login("robnt","8567main");
        lo.setUsername("ronit");
        System.out.println(lo.getUsername());

}
static class login{
    private String username;
    private String passwor;

    public String getUsername() {
        return username;
    }

    public boolean setUsername(String username) {
        this.username = username;
        return false;
    }

    public login(String usrnam, String pwd) {
        this.username = usrnam;
        this.passwor = pwd;
    }
}
}