package org.example;
public class RunnableApp implements Runnable{
    public static void main(String args[])
    {
        RunnableApp org = new RunnableApp();
        Thread t = new Thread(org, "123");
        t.start();
        System.out.println(t.getName());
    }
    @Override public void run()
    {
        System.out.println("My Runnable excample");
    }
}
