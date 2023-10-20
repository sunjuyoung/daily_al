package al04;

public class ch12 {


    private static final String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void main(String[] args) {

        String s = "2three45sixseven";


        StringBuilder sb = new StringBuilder();

        for(int i=0; i<words.length; i++){
           s =  s.replace(words[i],Integer.toString(i));
        }


        System.out.println(s);

    }
}
