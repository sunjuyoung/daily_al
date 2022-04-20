package oop.thread;

public class CreateAndStartThread_M1C1 {
    public static void main(String[] args) {
/*        Thread simpleThread = new SMFileThread();
        simpleThread.start();


        Thread videoThread = new VideoFileThread();
        videoThread.start();*/

        Runnable simpleRun = new SMFileThreadV1();
        Thread thread = new Thread(simpleRun);
        thread.start();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
