package al04;

public class mergeosrt1 {
    public static void main(String[] args) {
        int []arr = {4,2,3,1,7,8,10};
        mergesort(arr);
        for(int ar : arr){
            System.out.printf("%3d ", ar);
        }
    }

    public static void mergesort(int []arr){
        int [] tmp = new int[arr.length];
        mergesort(arr, tmp, 0, arr.length-1);

    }

    public static void mergesort(int[]arr,int[]tmp,int start, int end){
        if(start < end){
            int mid = (start + end) /2;

            mergesort(arr, tmp, start, mid);
            mergesort(arr, tmp, mid+1, end);
            merge(arr,tmp,start,mid,end);

        }

    }

    public static void merge(int[]arr,int[]tmp,int start,int mid, int end){


        for(int i=0; i<arr.length; i++){
            tmp[i] = arr[i];
        }

        int part1 = start;
        int part2 = mid+1;
        int index = start;

        while (part1 <= mid && part2 <=end){
            if(tmp[part1] <= tmp[part2]){
                arr[index] = tmp[part1];
                part1++;
            }else{
                arr[index] = tmp[part2];
                part2++;
            }
            index ++;
        }
        
        while(part1<=mid){
            arr[index] = tmp[part1];
            part1++;
            index++;
        }
        while(part2<=end){
            arr[index] = tmp[part2];
            part2++;
            index++;
        }
    }
}
