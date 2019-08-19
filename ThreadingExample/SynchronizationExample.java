class NumberCounter extends Thread{

    static synchronized public void printNumbers(){
        for(int num = 0; num < 10; num++){
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + num);
        }
    }

    @Override
    public void run(){
        printNumbers();
    }

}


class SynchronizationExample{
    public static void main(String args[]){

        for(int i = 0; i < 3; i++){
            new NumberCounter().start();
        }

    }
}