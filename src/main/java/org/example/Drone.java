package org.example;


public class Drone {
    private Box box;
    public void setBox(Box box) {
        this.box = box;
    }

    public String deliver(Window window) {
        if(box != null) {
            if (this.areAllBoxSidesLargerThanTheWindow(window)) {
                return "N";
            } else if (this.theBoxPassesTheWindow(window)) {
                return "S";
            } else {
                return "N";
            }
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
