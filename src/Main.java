public class Main {
    public static void main(String[] args) throws Exception {
        HiloThread hilo1 = new HiloThread();
        HiloThread hilo2 = new HiloThread();

        hilo1.start();
        hilo2.start();
    }
}
