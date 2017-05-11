package com.unisinos.br;

import com.unisinos.br.runnables.CatThread;

public class Main {

    public static void main(String[] args) throws InterruptedException
    {

        Thread myThread = new Thread(new CatThread());


        System.out.println(Thread.currentThread().getName());
        myThread.setName("MINHA THREAD");
        myThread.start();
        myThread.sleep(4000);
        myThread.join();
    }
}
