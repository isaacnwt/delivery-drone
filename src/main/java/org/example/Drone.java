package org.example;

public class Drone {
    private Box box;
    public void getBox(Box box) {
        this.box = box;
    }

    public String deliver(Window window) {
        return "S";
    }
}
