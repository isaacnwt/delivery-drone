package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Drone drone = new Drone();
        int A, B, C, H, W;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        H = sc.nextInt();
        W = sc.nextInt();

        Box box = new Box(A, B, C);
        drone.setBox(box);

        Window window = new Window(H, W);

        System.out.println(drone.deliver(window));
    }
}