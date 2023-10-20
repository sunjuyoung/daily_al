package ch07;


//k번째수

import java.util.Arrays;

/**
 * 배열의 i번째 숫자부터 j번째 숫자까지 자르고 정렬, k번째 수 구하기
 */
public class q23 {
    public static void main(String[] args) {


        int [] array = {1,5,2,6,3,7,4};

        int [][] commands = {{2,5,3},{4,4,1},{1,7,3}};


        for(int i=0; i< commands.length; i++){

            int startN = commands[i][0];
            int endN = commands[i][1];
            int k = commands[i][2];

            int[] ints = Arrays.copyOfRange(array, startN - 1, endN);
            int n = ints[k-1];

        }



    }
}
