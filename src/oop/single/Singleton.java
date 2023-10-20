package oop.single;

public class Singleton {

    public static Singleton singleton;
   //private static  Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static  synchronized Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }



}
