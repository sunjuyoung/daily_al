package ch07;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ch62 {

    public static void main(String[] args) {
        int [] lost = {2,4};
        int [] reserve = {1,3,5};

        Arrays.sort(lost);
        Arrays.sort(reserve);


        Set<Integer> retains = Arrays.stream(lost).boxed().collect(Collectors.toSet());

        retains.retainAll(Arrays.stream(reserve).boxed().collect(Collectors.toSet()));

        System.out.println(retains);


    }
}
