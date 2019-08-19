class NumberCounter implements Runnable {
    
    @Override
    public void run(){
        System.out.println("Thread: " + Thread.currentThread().getId() + " has started!");

        for(int num = 0; num < 10; num++){
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + num);
            try{
                Thread.sleep(5);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class MyRunnableExample{
    public static void main(String args[]){

        Thread t1 = new Thread(new NumberCounter());
        Thread t2 = new Thread(new NumberCounter());
        t1.start();
        t2.start();

    }
}