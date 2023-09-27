package org.example;


public class Drone {
    private Box box;
    public void setBox(Box box) {
        this.box = box;
    }

    public String deliver(Window window) {
        if(box != null) {
            if (this.theBoxPassesTheWindow(window)) {
                return "S";
            } else {
                return "N";
            }
        } else throw new NullPointerException("The drone doesn't have a box to deliver");
    }

    private boolean theBoxPassesTheWindow(Window window) {
        return isABoxFaceParallelToWindow(box.getSideA(), box.getSideB(), window)
            || isABoxFaceParallelToWindow(box.getSideA(), box.getSideC(), window)
            || isABoxFaceParallelToWindow(box.getSideB(), box.getSideC(), window);
    }
    
    private boolean isABoxFaceParallelToWindow(int boxHeight, int boxWidth, Window window) {
        return (boxHeight <= window.getWidth() && boxWidth <= window.getHeight())
            || (boxHeight <= window.getHeight() && boxWidth <= window.getWidth());
    }
}
