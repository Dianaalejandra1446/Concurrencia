public class Main2 {

    public static void main(String[] args) {
        HiloRunnable runnable1 = new HiloRunnable();
        HiloRunnable runnable2 = new HiloRunnable();
    
        Thread hilo1 = new Thread(runnable1);
        Thread hilo2 = new Thread(runnable2);
    
        hilo1.start();
        hilo2.start(); 
    }
}
