package al04;

public class qtest1 {
    public static void main(String[] args) {
        

       int []arr = {4,6,8,1,2,10,9};

       quicksort(arr,0,arr.length-1);

       for(int A : arr){
        System.out.printf("%3d",A);
    }
      
       
    }
    public static void quicksort(int []arr,int start,int end){
        
        int part2 = partition(arr,start,end);
        if(part2-1 >start){
            quicksort(arr, start, part2-1);
        }
        if(part2<end){
            quicksort(arr, part2, end);
        }
        
    }

    public static int partition(int[]arr,int start,int end){
    
        int pivot = arr[(start+end)/2];
        while(start<end){
            while(arr[start]<pivot)start++;
            while(arr[end]>pivot)end--;

            if(start<=end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    public static void swap(int[]arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    
}
