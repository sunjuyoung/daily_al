package august.a;

public class test1 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int a=i; a<4; a++){
                System.out.printf(" ");
            }
            for(int j=0; j<((i-1)*2+1); j++){
                System.out.printf("*");
            }
            System.out.println();
        }
        // for(int i=1; i<6; i++){
        //     for(int j=1; j<i+1; j++){
        //         System.out.printf("*");
        //     }
        //     System.out.println("");
        // }

        // for(int i=1; i<6; i++){
        //     for(int j=1; j<6-i; j++){
        //         System.out.printf(" ");
        //     }
        //     for(int a=1; a<i+1; a++){
        //         System.out.printf("*");
        //     }
           
        //     System.out.println("");
        // }




    }
}
