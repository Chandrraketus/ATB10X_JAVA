package JavaPractice;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class letter_Count {
    public static void main(String[] args) {
        String name = "Chandraketu".toLowerCase();
        Map<Character,Integer>letterCount = new HashMap<>();

        for (char c:name.toCharArray()){
            if(Character.isLetter(c)){
                letterCount.put(c,letterCount.getOrDefault(c,0) +1);

            }
        }
        System.out.println("letter frequency in your name ");
        for(Map.Entry<Character,Integer> Entry:letterCount.entrySet()){
            System.out.println(Entry.getKey() + " : " + Entry.getValue());
        }
    }
}
