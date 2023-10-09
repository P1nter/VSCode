package lab_6;

import java.util.LinkedList;

public class FIFO {

    public LinkedList<String> lancoltLista = new LinkedList<>();

    public synchronized void put(String str) throws InterruptedException
    {
        while(lancoltLista.size() >= 10)
            Thread.sleep(1000);
        
        
        lancoltLista.add(str);
        notify();
    }

    public synchronized String get() throws InterruptedException
    {
        String str = new String("");

        while(lancoltLista.isEmpty())
            Thread.sleep(1000);
        
        
        str = lancoltLista.removeFirst();
        notify();
        
        return str;
    } 
}
