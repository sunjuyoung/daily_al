package al03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//구간 합 구하기
public class test3_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int sNo = Integer.parseInt(stringTokenizer.nextToken());
        int qNo = Integer.parseInt(stringTokenizer.nextToken());
        System.out.println(sNo);
        System.out.println(qNo);

        long[] S = new long[sNo+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i=1; i<=sNo; i++){
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.println("S0:::"+S[0]);
        System.out.println("S1:::"+S[1]);
        for(int q= 0; q<qNo; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i= Integer.parseInt(stringTokenizer.nextToken());
            int j= Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j]-S[i-1]);

        }


    }


}
