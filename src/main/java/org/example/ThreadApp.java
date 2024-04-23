package org.example;

public class ThreadApp extends Thread{
    public void run()
        {
            System.out.print("My excample Thread");
        }
        public static void main(String[] args)
        {
            ThreadApp i = new ThreadApp();
            i.start();
    }
}
