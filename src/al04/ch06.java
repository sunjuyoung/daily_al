package al04;

public class ch06{
    public static void main(String[] args) {

        String s = "AB";

        int n = 1;

        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            sb.append(push(c,n));
        }


        System.out.println(sb.toString());
    }

    private static char push(char c , int n){
        if(!Character.isAlphabetic(c))return c;

        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        int p = c - offset;

        p =  p +n;
        return (char)(offset + p);


    }
}
