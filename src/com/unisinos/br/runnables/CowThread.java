package com.unisinos.br.runnables;

/**
 * Created by i848340 on 10/05/17.
 */
public class CowThread implements Runnable
{
    @Override
    public void run()
    {
        while (true)
        {
            System.out.println("Moo!!!");
        }
    }
}
