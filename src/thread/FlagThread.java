package thread;

import model.Flag;

public class FlagThread extends Thread {

	private Flag colorFlag;
	public FlagThread(int width, int height, int speed){
		colorFlag = new Flag(width, height, speed);
	}

	public void run() {
		colorFlag.draw();
	}
}
