package al03;

public class ssort {
    public static void main(String[] args) {
        int[]A = {4,3,6,8,7,5,2,1};
       
        for(int i=0; i<A.length; i++){
            for(int j=i; j<A.length; j++){
                if(A[i]>A[j]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }

        for(int b : A){
            System.out.printf("%3d",b);
        }
    }
}
