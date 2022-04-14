package al03;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/*
 int a = sc.nextInt();
sc.useDelimiter("\n");
        String b = sc.next();
        System.out.println(b);
        String[] split = b.split(" ");

        int avg=0;
        int sum=0;
        for(int i=0; i<split.length; i++){
            System.out.println(split[i]);
            sum +=(int)Integer.valueOf(split[i]);
        }
        avg = sum/a;
        System.out.println(avg);*/

        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        int sum =0;
        int max =0;
        for(int i=0; i<n; i++){
            sum += A[i];
        }
        System.out.println(sum);


    }


}
