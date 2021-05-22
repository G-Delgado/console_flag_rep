package thread;

import java.io.IOException;

import model.Flag;

public class FlagThread extends Thread {

	private Flag colorFlag;
	public FlagThread(int width, int height, long speed, int color, int start){
		colorFlag = new Flag(width, height, speed, color, start);
	}

	public void run() {
			try {
				colorFlag.draw();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
}
