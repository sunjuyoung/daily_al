package ch07;

import java.util.Arrays;

public class ch01 {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        int target = 7;

        int i = biSearch(arr, target);

        System.out.println(i);

        int ii = Arrays.binarySearch(arr,3);
        System.out.println(ii);
    }



    public static int biSearch(int [] arr, int target){
        int start = 0;
        int end = arr.length;

        while (end > start){
            int mid = (start + end ) /2;
            int value = arr[mid];

            if(value == target){
                return mid;
            }else if(value > target){
                end= mid;
            }else{
                start = mid +1;
            }
        }


        return -1;
    }
}
