package lab_6;


public class Application {
    public static void main(String[] args)
    {
        try
        {    

            FIFO fi = new FIFO();
            Producer prod1 = new Producer("elso", fi, 1000);
            Producer prod2 = new Producer("masodik", fi, 1000);
            Consumer con1 = new Consumer("elso", fi, 1000);
            Consumer con2 = new Consumer("masodik", fi, 1000);

            prod1.start();
            Thread.sleep(500);
            prod2.start();
            Thread.sleep(500);

            
            con1.start();
            Thread.sleep(500);
            con2.start();
            Thread.sleep(500);
            

        } catch(InterruptedException exc)
        {
            exc.getStackTrace(); 
        }
    }
}
