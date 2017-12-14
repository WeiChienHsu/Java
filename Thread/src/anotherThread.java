

public class anotherThread extends Thread{
    @Override
    public void run() {
            System.out.println(ANSI_BLUE + "Hello from another Thread");
    }
}
