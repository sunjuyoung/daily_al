package al03;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        char[] str = b.toCharArray();

        int sum =0;
        for(int i=0; i<a; i++){
            sum += str[i] - '0';
        }
        System.out.println(" 합 : "+ sum);
    }


}
