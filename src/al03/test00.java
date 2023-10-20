package al03;

public class test00 {
    public static void main(String[] args) {
        

        int[] ar = new int[6];

        for(int j=0; j<10; j++){
            for(int i=0; i<6; i++){
                ar[i] = (int)(Math.random()*10);
            }
    
            for(int i : ar){
                System.out.printf("%3d", i);
            }
            System.out.println();
        }
      
    }
}
