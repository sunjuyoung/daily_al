package oop.weapon;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();

        a.add(0,"1");
        a.add(1,"2");
        a.add(2,"4");
        a.add(3,"5");
        a.add(4,"^");
        a.add(5,"34");


       for(int i=0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
        System.out.println("");
       a.add(0,"0");
        for(int i=0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
    }
}
