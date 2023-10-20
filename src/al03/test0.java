package al03;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class test0 {
    public static void main(String[] args) {


    int[][]dNum = {
           // {2,14,17,20,25,45},
            {3,18,27,25,35,45},
            {2,4,10,21,30,44},
           // {3,9,20,34,41,45},
            {3,11,15,20,35,44}
            

    };
    int[] number = new int[6];
    int N = 10000;
    for(int a=0; a<N; a++){

    
    for(int i=0; i<6; i++){
        number[i] = (int)(Math.random()*45)+1;

        // for(int d=0; d<dNum.length; d++){
        //     for(int j=0; j<6; j++){
        //         if(i>0){
        //             if(dNum[d][j] == number[i]){
        //                 if(i>=0)--i;
                        
        //             }
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
