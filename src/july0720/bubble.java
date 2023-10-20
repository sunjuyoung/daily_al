package july0720;

public class bubble {
    public static void main(String[] args) {
        

        int [] ar = {3,6,8,4,2,1,9};
        int [] temp = new int[ar.length];
        mergesort(ar,temp,0,ar.length-1);

        for(int arr: ar){
            System.out.printf("%3d" , arr);
        }
    }

    public static void mergesort(int[]ar,int[]temp,int start, int end){
        if(start < end){
            int mid = (start+end)/2;
            mergesort(ar,temp,start,mid);
            mergesort(ar, temp, mid+1, end);
            merge(ar,temp,mid,start,end);
        }
    }

    public static void merge(int[]ar,int[]temp,int mid,int start, int end){

        for(int i=start; i<=end; i++){
             temp[i] = ar[i];
        }
    
        int part1 = start;
        int part2 = mid+1;
        int index = start;
        while(part1 <= mid && part2 <=end){
            if(ar[part1] < ar[part2]){
                ar[index] = temp[part1];
                part1++;
            }else{
                ar[index]  = temp[part2];
                part2++;
            }
            index++;
        }

        while(part1<=mid){
            ar[index] = temp[part1];
            part1++;
            index++;
        }
        while(part2<=end){
            ar[index]  = temp[part2];
            part2++;
            index++;
        }


    }
}
