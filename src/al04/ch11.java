package al04;

public class ch11 {

    public static void main(String[] args) {

        String s = "pPoooyY";


        String ss = s.toLowerCase();

        int yNum = 0;
        int pNum = 0;


        for(char c : ss.toCharArray()){
            if(c == 'y'){
                yNum++;
            }else if(c == 'p'){
                pNum++;
            }
        }


        System.out.println(yNum == pNum? true : false);
    }
}
