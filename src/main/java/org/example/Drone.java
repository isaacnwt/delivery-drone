package org.example;


public class Drone {
    private Box box;
    public void getBox(Box box) {
        this.box = box;
    }

    public String deliver(Window window) {
        if(box != null) {
            if (this.areAllBoxSidesLargerThanTheWindow(window)) {
                return "N";
            }
            return "S";
        } else throw new NullPointerException("The drone doesn't have a box to deliver");
    }

    private boolean areAllBoxSidesLargerThanTheWindow(Window window) {
        return this.box.getSideA() > window.getHeight()
            && this.box.getSideA() > window.getWidth()
            && this.box.getSideB() > window.getHeight()
            && this.box.getSideB() > window.getWidth()
            && this.box.getSideC() > window.getHeight()
            && this.box.getSideC() > window.getWidth();
    }
}
