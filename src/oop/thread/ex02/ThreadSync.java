package oop.thread.ex02;

public class ThreadSync {
    public static void main(String[] args) {
        Mydata mydata = new Mydata();
        Thread thread = new PlusThread(mydata);
        thread.start();


        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }


        Thread thread1 = new PlusThread(mydata);
        thread1.start();
    }
}
