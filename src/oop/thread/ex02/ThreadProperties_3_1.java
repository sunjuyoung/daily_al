package oop.thread.ex02;

public class ThreadProperties_3_1 {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.setDaemon(false);//일반쓰레드
        //thread.setDaemon(true);//일반쓰레드
        thread.setName("thread1");
        thread.start();

        try{
            Thread.sleep(3500);
        }catch (InterruptedException e){

        }
        System.out.println("main thread 종료");
    }
}
