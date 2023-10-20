package july0720;

public class quickq {
    public static void main(String[] args) {
        
        int [] ar = {3,6,8,4,2,1,9};

        quicksort(ar,0,ar.length-1);

        for(int arr : ar){
            System.out.printf("%3d" , arr);
        }

    }

    public static void quicksort(int[]arr,int start, int end){
       
       int part2 =  partition(arr,start,end);
       if(start < part2-1){
        quicksort(arr,start,part2-1);
       }
       if(part2 < end){
        quicksort(arr,part2,end);
       }
       
    }

    public static int partition(int[] arr,int start, int end){

        int pivot = (start + end)/2;

        while(start <= end){
            while(arr[start]< arr[pivot])start ++;
            while(arr[end]>arr[pivot])end--;
            
            if(start<=end){
                swap(arr,end,start);
                start++;
                end--;
            }

            
        }

        return start;
    }

    public static void swap(int[]arr,int end,int start){
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;

    }
}
