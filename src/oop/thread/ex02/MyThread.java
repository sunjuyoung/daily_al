package oop.thread.ex02;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(getName() + " : " + (isDaemon()? "데폰 쓰레드" : "일반쓰레드"));
        for(int i=0; i<6; i++){
            System.out.println(getName() + " : " + i + "초");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }
}
