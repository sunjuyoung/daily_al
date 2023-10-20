package al03;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int n = 6;
        int[] v = {4,1,7,6,5,2};
        Integer maxNum = 0;
        Integer num;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                num = v[i] - v[j];
                if(num > maxNum){
                    maxNum = num;
                }

            }
        }

        System.out.println(maxNum);





    }


}
