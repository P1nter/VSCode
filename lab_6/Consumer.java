package lab_6;


public class Consumer extends Thread {

    private String str;
    private FIFO fi;
    private int sleepTime;

    public Consumer(String s, FIFO f, int n)
    {
        str = s;
        fi = f;
        sleepTime = n;
    }

    public void go()
    {
        while(true)
        {
            try
            {
                synchronized (fi)
                {
                    String deleted = new String(fi.get());
                    System.out.println
                    (
                        deleted + " deleted " + System.currentTimeMillis()
                    );
                }
                Thread.sleep(sleepTime);
            } catch(InterruptedException exc)
            {
                exc.printStackTrace();
            }
        }
    }

    public void run(){go();}

}
