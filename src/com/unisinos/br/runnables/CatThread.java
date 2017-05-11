package com.unisinos.br.runnables;

/**
 * Created by i848340 on 10/05/17.
 */
public class CatThread implements Runnable
{
    int counter = 0;

    @Override
    public void run()
    {
        while (Thread.currentThread().isAlive())
        {
            System.out.println(counter + "Meow!!! - "+Thread.currentThread().getName());
            counter++;
            try
            {
                Thread.sleep(1000);
                if (counter == 5) Thread.dumpStack();
                if (counter == 10)
                {
                    Thread.currentThread().interrupt();
                    Thread.currentThread().join();
                }

            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
