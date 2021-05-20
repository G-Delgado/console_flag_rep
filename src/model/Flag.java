package model;

public class Flag {
    private int width;
    private double speed;

    public Flag(int w, double s) {
        width = w;
        speed = s;
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
