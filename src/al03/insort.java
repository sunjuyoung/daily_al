package al03;

public class insort {
    public static void main(String[] args) {
        int[]A = {4,3,6,8,7,5,2,1};
       
        for(int i=0; i<A.length-1; i++){
            for(int j=0; j<A.length-i-1; j++){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }

        for(int b : A){
            System.out.printf("%3d",b);
        }
    }
}
