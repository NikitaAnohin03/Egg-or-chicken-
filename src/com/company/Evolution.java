package com.company;

public class Evolution implements Runnable {

    Thread thread;

    public Evolution(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName());

        }
    }
}