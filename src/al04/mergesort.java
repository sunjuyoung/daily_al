package al04;

public class mergesort {

    public static int [] A,tmp;

    public static void main(String[] args) {
    
        A = new int[6];
        tmp = new int[6];

        for(int i=0; i<A.length; i++){
            A[i] = (int)(Math.random()*10)+1;
            tmp[i] = A[i];
        }


        int N = A.length;
        
        merget_sort(0,N-1);

        for(int ar : A){
            System.out.printf("%3d ",ar);
        }
        System.out.println();
        for(int ar : tmp){
            System.out.printf("%3d ",ar);
        }
    }


    

    public static void merget_sort(int s, int e){
        if(e - s < 1){
            return;
        }
        int m = s + ((e-s)/2);
        
        //재귀 함수 형태로 구현
        merget_sort(s, m);
        merget_sort(m+1, e);

        int k = s;
        int index1 = s;
        int index2 = m+1;

        //양쪽 그룹의 index가 가리키는 값을 비교해 더 작은 수를 선택해 배열에 저장
        while (index1 <= m && index2 <= e){
            if(tmp[index1] > tmp[index2]){
                A[k] = tmp[index2];
                k++;
                index2++;
            }else{
                A[k] = tmp[index1];
                k++;
                index1++;
            }
        }

        //한쪽 그룹이 모든 선택된 후 남아 있는 값 정리하기
        while(index1 <= m){
            A[k] = tmp[index1];
            k++;
            index1++;
        }
        while(index2 <=e){
            A[k] = tmp[index2];
            k++;
            index2++;
        }


    }

}
