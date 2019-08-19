class NumberCounter extends Thread{

    @Override
    public void run(){
        synchronized(this){
            System.out.println("Thread: " + Thread.currentThread().getId() + " has started!");
            for(int num = 0; num < 10; num++){
                System.out.println("Thread: " + Thread.currentThread().getId() + " -> " + num);
                try{
                    Thread.sleep(10);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }
}

class SynchronizingBlocks{
    public static void main(String args[]){

        NumberCounter t1 = new NumberCounter();
        NumberCounter t2 = new NumberCounter();

        t1.start();
        t2.start();

    }
}