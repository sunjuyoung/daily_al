package al04;

/**
 * quicksort
 */
public class quicksort1 {

    public static void main(String[] args) {
    
        int []arr = {5,7,8,2,1,99,6};

        quicksort(arr);

        for(int A: arr){
            System.out.printf("%3d",A);
        }
       
        for(int i=0; i<5; i++){
            for(int j=0; j<i; j++){
                System.out.printf("* ");
            }
            System.out.println("");
        }
        
        
    }

    public static void quicksort(int[]arr){
        quicksort(arr, 0, arr.length-1);
        
    }

    public static void quicksort(int[]arr,int start,int end){
        int start2 = partition(arr,start, end); 
        if(start2-1 > start){
            quicksort(arr, start, start2-1);
        }
        if(start2 < end){
            quicksort(arr, start2, end);
        }
    }

    public static int partition(int[]arr,int start,int end){
        int pivot = arr[(start+end)/2];
        
        while(start<=end){
            while(pivot<arr[end])end--;
            while(pivot>arr[start])start++;
            if(start<=end){
                swap(arr,start,end);
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