class NumberCounter extends Thread{

    @Override
    public void run(){
        System.out.println("Thread: " + Thread.currentThread().getId() + " has started!");

        for(int num = 0; num < 10; num++){
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + num);
            try{
                sleep(10);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

}

class Threading{
    public static void main(String args[]){

        NumberCounter t1 = new NumberCounter();
        NumberCounter t2 = new NumberCounter();
        t1.start();
        t2.start();

    }
}