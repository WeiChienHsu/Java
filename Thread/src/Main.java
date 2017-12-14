public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from the main Thread");

        Thread anotherThread = new anotherThread();
        anotherThread.start();

        new Thread() {
            public void run(){
                System.out.println("Hello from the anonymous class thread");
            }
        }.start();

        System.out.println("Hello again from the main Thread");


    }
}
