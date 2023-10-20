package ch07;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ch75 {

    public static void main(String[] args) {
        String [] id_list = {"muzi", "frodo", "apeach", "neo"};
        String [] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};

        Map<String, Integer> reported = new HashMap<>();

        Map<String, Set<String>> reports = new HashMap<>();

        for(String s : id_list){
            reports.put(s, new HashSet<>());
        }


        for(String s : report){
            String[] split = s.split(" ");
            String reporter = split[0];
            String target = split[1];


            Set<String> set = reports.get(reporter);

            if(set.contains(target))continue;

            set.add(target);


            reported.putIfAbsent(target, 0);
            reported.put(target, reported.get(target) + 1);

        }

        System.out.println(reported.get("muzi"));



    }
}
