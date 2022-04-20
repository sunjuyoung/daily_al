package oop.thread;

public class SMFileThread extends Thread{

    @Override
    public void run() {
        String [] strArray = {"하나","둘","셋","넷","다섯"};


        for(int i=0; i<strArray.length; i++){
            System.out.println(" - 자막 번호 " +strArray[i]);
            try{
                Thread.sleep(200);
            }catch (InterruptedException e){

            }
        }
    }
}

