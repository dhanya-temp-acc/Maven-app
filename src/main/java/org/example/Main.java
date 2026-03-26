package org.example;

public class Main {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Sum2 = " + main.add(2,3));
        System.out.println("Mean2 = " + (main.add(2,3))/2);
        System.out.println("Mean3 =   " + (main.add(9,3))/2);
    }
}