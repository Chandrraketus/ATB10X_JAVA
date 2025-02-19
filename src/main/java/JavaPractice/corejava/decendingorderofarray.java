package JavaPractice.corejava;

import java.util.Arrays;

public class decendingorderofarray {
    public static void main(String[] args) {
        int[] arry = {41,12,1,0,7,80};
        for(int i=0;i<arry.length;i++){
            for(int j=i+1;j<arry.length;j++){
                if(arry[i]<arry[j]){
                    int temp = arry[i];
                    arry[i]=arry[j];
                    arry[j]=temp;
                }
            }
        }
        System.out.println("sorted arry"+ Arrays.toString(arry));

    }

}
