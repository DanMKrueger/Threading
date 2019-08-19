class ThreadB extends Thread{

    int total;

    @Override
    public void run(){
        synchronized(this){
            for(int i = 0; i <= 100 ; i++){
                total += i;
            }
            notify();
        }
    }
}

public class WaitNotify {
    public static void main(String[] args){
        ThreadB myThread = new ThreadB();
        myThread.start();
 
        synchronized(myThread){
            try{
                System.out.println("Waiting for myThread to complete...");
                myThread.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
 
            System.out.println("Total is: " + myThread.total);
        }
    }
}
 