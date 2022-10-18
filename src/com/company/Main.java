package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("What will appear faster?");

        Evolution denis = (new Evolution("Chicken"));
        Evolution nikita = (new Evolution("Egg"));

        try {
            denis.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("First appeared:");
        if (nikita.thread.isAlive()){
            nikita.thread.join();
            System.out.print("Chicken");
        }
        else{
            System.out.println("Egg");
        }
    }

}