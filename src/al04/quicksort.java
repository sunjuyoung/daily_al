package al04;

/**
 * quicksort
 */
public class quicksort {

    public static void main(String[] args) {
        int [] arr = {4,5,1,8,6,9};
        quicksort(arr);
        for(int A : arr){
            System.out.printf("%3d",A);
        }
    }


    private static void quicksort(int[] arr){
        quicksort(arr,0,arr.length-1);
    }
    private static void quicksort(int[] arr, int start,int end){
        int part2 = partition(arr, start, end); //오른쪽 파티션 첫번째 수
        if(part2 -1 > start){ //첫번째 수가 시작점 다음에서 시작한다면 왼쪽은 데이터 가 한개이므로, 한개 이상 차이 날때만 정렬
            quicksort(arr, start, part2-1);
        }
        if(part2 < end){
            quicksort(arr, part2, end);
        }
    }
    private static int partition(int []arr,int start, int end){
        int pivot = arr[(start+end)/2];
        while(start <= end){
            while(arr[start] < pivot)start++;
            while(arr[end] > pivot)end--;
            if(start<=end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        return start;
    }
    private static void swap(int[]arr,int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}