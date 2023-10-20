package ch07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 두개 뽑아서 더하기
 *
 */
public class ch24 {

    public static void main(String[] args) {

        int [] numbers = {2,1,3,4,1};

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }

        }

        int[] ints = set.stream().mapToInt(Integer::intValue).sorted().toArray();


        String s = "WEPOIgjdslkgj";

        s = s.chars().boxed().sorted((a,b)->b-a).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

        System.out.println(s);

        String[] s1 = {"sun","bed","car"};

        Arrays.sort(s1,(a,b)->{
            return a.charAt(1) - b.charAt(1);
        });





    }
}
