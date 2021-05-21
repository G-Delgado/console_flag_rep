package model;

public class Flag {
    private int width;
    private int height;
    private double speed;

    public Flag(int w, int h, double s) {
        width = w;
        height = h;
        speed = s;
    }

    public void draw() {

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int w) {
        width = w;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double s) {
        speed = s;
    }
}
