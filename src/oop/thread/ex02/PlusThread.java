package oop.thread.ex02;

public class PlusThread extends Thread{

    Mydata mydata;
    public PlusThread(Mydata mydata){
        this.mydata = mydata;
    }

    @Override
    public void run() {
        mydata.plusData();
        System.out.println(getName() + "실행 결과 : "+ mydata.data);
    }
}
