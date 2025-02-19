package JavaPractice.corejava;

import java.util.Arrays;

public class accendingusingforlooparray {
    public static void main(String[] args) {
        int[] arry = {12, 11, 9, 10, 17};
        for(int i =0;i<arry.length;i++){
            for(int j=i+1;j<arry.length;j++){
                if(arry[i]>arry[j]){
                    int temp = arry[i];
                    arry[i] =arry[j];
                    arry[j]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(arry));
    }

}
