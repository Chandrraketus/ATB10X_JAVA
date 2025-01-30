package JavaPractice;

public class vovels_count {
    public static void main(String[] args) {
        String input = "Chandraketu Sharma";
        int VovelCount =0;
        int ConsonentCount =0;
        input = input.toLowerCase();
        for(int i =0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o'|| ch == 'u'){
                VovelCount++;
                } else if (ch>='a' && ch<='z') {

                ConsonentCount++;

            }

        }
        System.out.println(VovelCount);
        System.out.println(ConsonentCount);

        }

    }
