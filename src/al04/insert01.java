package al04;

import javax.swing.*;
import java.util.Scanner;

public class insert01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        for(int i=1; i<N; i++){
            int point = i;
            int value = A[i];
            for(int j=i-1; j>=0; j--){
                if(A[i]>A[j]){
                 point = j+1;
                 break;
                }
                if(j==0){
                    point = 0;
                }
            }
            for(int j=i; j>point; j--){
                A[j] = A[j-1];
            }
            A[point] = value;
        }

        for(int c: A){
            System.out.printf("%3d",c);
        }
    }
}
