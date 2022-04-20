package al04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort04 {

    public static int A[] ;
    public static int temp[] ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //정렬할 수 개수

        A = new int[N+1]; //정렬할 배열
        temp = new int[N+1]; //임시 배열

        for(int i=1; i<=N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        //병합 정렬
        int e = N; //종료점
        int s = 1; //시작점

        sort(s,e);//재귀

       for(int i=0; i<N; i++){
           System.out.println(A[i]);
       }

    }
    private static void sort(int s, int e){
        if(e-s<1)return;

        int m = s + (e-s)/2; //중간점
        sort(s,m);
        sort(m+1,e);

        for(int i=s; i<=e; i++){
            temp[i] = A[i];
        }

        int k = s;
        int index1 = s; //앞쪽그룹 시작점
        int index2 = m+1; //뒤쪽그룹 시작점

        //두그룹을 병합
        while(index1<=m && index2<=e){
            //양쪽 그룹의 index가 가리키는 값을 비교해 더 작은 수를 선택해 배열에 저장하고,
            //선택된 데이터의 index값을 오른쪽으로 한 칸 이동하기
            if(temp[index1] > temp[index2]){
                A[k] = temp[index2];
                index2++;
                k++;
            }else{
                A[k] = temp[index1];
                index1++;
                k++;
            }
        }

        //한쪽 그룹이 모두 선택한 후 남아 있는 값 정리하기
        while(index1<=m){
            A[k] = temp[index1];
            index1++;
            k++;
        }
        while(index2<=e){
            A[k] = temp[index2];
            index2++;
            k++;
        }
    }
}
