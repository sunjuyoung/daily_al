package al03;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class test0 {
    public static void main(String[] args) {


    int[][]dNum = {
            {2,3,10,12,25,27},
            {6,9,19,25,29,30},
            {37,41,43,30,23,34}

    };
    int[] number = new int[6];
    int N = 4;
    for(int a=0; a<N; a++){

    
    for(int i=0; i<6; i++){
        number[i] = (int)(Math.random()*45)+1;

        // for(int d=0; d<dNum.length; d++){
        //     for(int j=0; j<6; j++){
        //         if(dNum[d][j] == number[i]){
        //             if(i>=0)--i;
                    
        //         }
        //     }
        // }
    }

        Arrays.sort(number);
        for(int n : number){
            System.out.printf("%3d",n);
        }
        System.out.println("");

    }


    }


}
