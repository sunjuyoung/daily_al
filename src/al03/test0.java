package al03;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class test0 {
    public static void main(String[] args) {

    int[][]dNum = {
            {1,3,10,15,25,28},
            {8,9,24,25,29,35},
            {4,13,24,30,33,39}

    };
    int[] number = new int[6];
    for(int i=0; i<6; i++){
        number[i] = (int)(Math.random()*45)+1;

        // for(int d=0; d<dNum.length; d++){
        //     for(int j=0; j<6; j++){
        //         if(dNum[d][j] == number[i]){
        //             --i;
        //         }
        //     }
        // }
    }

        Arrays.sort(number);
        for(int n : number){
            System.out.printf("%3d",n);
        }




    }


}
