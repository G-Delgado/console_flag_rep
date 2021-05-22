package model;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Flag {
    private int width;
    private int height;
    private long speed;
    private int color;
    private int start;


    public final static String ESC   = "\u001b[";
	public final static String UP    = ESC+"A";
	public final static String DOWN  = ESC+"B";
	public final static String RIGHT = ESC+"C";
	public final static String LEFT  = ESC+"D";
	public final static String NXLN  = ESC+"1E";
    public final static String RES  = ESC+"u";

    public Flag(int w, int h, long s, int c, int st) {
        width = w;
        height = h;
        speed = s;
        color = c;
        start = st;
    }

    public void draw() throws InterruptedException, IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // I kind of inspired myself from Daniel (The monitor) and Jacobo from AP2, as I was in that breakout room when they suggested using BufferedWriter
        bw.write(ESC + start + ";" + 0 + "f");

        int w = 1;

        while (w < width) {
            for (int i = 0; i <= height; i++) {
                bw.write(ESC + color + "m" + ' ');
                bw.flush();
                Thread.sleep(speed);
                // This determines the position of the y-axis or height at a particular moment.
                // Always starting from an specific point an reaching to a limit set by the "height"
                int y = start + i;
                // This command assings the cursor in the (y,x) position.
                bw.write(ESC + y + ";" + w + "f");
            }
            // The drawing width increases
            w++;
            bw.write(ESC + start + ";" + w + "f");
        }

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int s) {
        start = s;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int w) {
        width = w;
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long s) {
        speed = s;
    }
}

