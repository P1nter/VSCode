package lab_6;

public class Producer extends Thread{

    private String str;
    private FIFO fi;
    private int sleepTime;

    //Konstruktorok
    public Producer(String s, FIFO f, int n){
        str = s;
        fi = f;
        sleepTime = n;
    }

    public Producer(){}

    public void go()
    {
        int i = 0;

        while(true)
        {
            try
            {
                

                    String strToAdd = str + " " + i;

                    fi.put(strToAdd);
                    System.out.println
                    (
                        strToAdd  + " added " + System.currentTimeMillis()
                    );

            
                Thread.sleep(sleepTime);
                i++;
            } catch(InterruptedException intexc)
            {
                intexc.printStackTrace();
            }

        }
    }

    public void run(){go();}
}
