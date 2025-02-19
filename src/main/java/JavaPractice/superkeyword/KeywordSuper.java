package JavaPractice.superkeyword;

public class KeywordSuper {
    public static void main(String[] args) {
        child cd = new child();
        cd.vq();  // Call the method to see the output
    }
}

class parent {
    void home() {
        System.out.println("Father had a 2 BHK home");
    }
}

class child extends parent {
    void vq() {
        super.home(); // Calling the parent class method using super
    }
}
