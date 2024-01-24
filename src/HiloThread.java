public class HiloThread extends Thread{
    public void run(){
        for(int i = 0;i<= 5;i++){
            //Imprime el identificador de cada hilo con el currentThread
            System.out.println("Hilo "+Thread.currentThread().getId()+ ": "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("El hilo se ja interrumpido");
            }
        }
    }
}
