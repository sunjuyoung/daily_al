package al03;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] n = new int [2];

        //데이터의 개수, 질의 개수 입력
        for(int i=0;i<2; i++){
            n[i] = sc.nextInt();
        }
        //데이터의 개수
        int dNum = n[0];
        //질의 개수
        int qNum = n[1];

        //배열
        int [] a = new int[dNum];

        // 배열 입력
        for(int i=0; i<dNum; i++){
            a[i] = sc.nextInt();
        }

        //합배열 구하기
        long[] S = new long[dNum+1];
        for(int i=1; i<=dNum; i++){
            S[i] = S[i-1] + a[i-1];
        }

        int[][]ar = new int[qNum][2];

        for(int i=0; i<qNum; i++){
            for(int j=0; j<2; j++){
                ar[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<ar.length; i++){
            System.out.println(S[ar[i][1]] - S[ar[i][0] -1]);
        }

















/*        for(int i=0; i<qNum; i++){
            for(int j=0; j<2; j++){
                System.out.printf("%3d",ar[i][j]);
            }
            System.out.println("");
        }*/

    }


}
