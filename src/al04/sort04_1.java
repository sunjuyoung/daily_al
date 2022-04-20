package al04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort04_1 {

    public static int[]A;
    public static int[]temp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        A = new int[N];
        temp = new int[N];
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        sort(0,N);
        for(int i=0; i<N; i++){
            System.out.println(A[i]);
        }

    }

    static void sort(int s, int e){
        if(e-s<1)return;
        int m = s+(e-s)/2;

        sort(s,m);
        sort(m+1,e);

        for(int i=s; i<e; i++){
            temp[i] = A[i];
        }

        int k = s;
        int index1= s;
        int index2 = m+1;

        while(index1<m && index2<e){
            if(temp[index1] < temp[index2]){
                A[k] = temp[index1];
                k++;
                index1++;
            }else{
                A[k] = temp[index2];
                k++;
                index2++;
            }
        }
        while(index1<m){
            A[k] = temp[index1];
            index1++;
            k++;
        }
        while(index2<e){
            A[k] = temp[index2];
            index2++;
            k++;
        }


    }
}
