package JavaPractice;

public class thiskeyword {
    public static void main(String[] args) {
        Mobile mb = new Mobile("oppo","2021",200000);
        System.out.println(mb.ModelName);
        System.out.println(mb.yearoflaunch);
        System.out.println(mb.price);

    }

    static class Mobile{
        String ModelName;
        String yearoflaunch;
        int price;

        //creating parametrized constructor

        Mobile(String ModelName_c , String yearoflaunch_c,int price_c){
            this.ModelName = ModelName_c;
            this.yearoflaunch = yearoflaunch_c;
            this.price = price_c;

        }
    }
}
