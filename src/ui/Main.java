package ui;

import thread.FlagThread;

public class Main {
	
	public final static String ESC   = "\u001b[";
	
	public final static int YELLOW = 43;
	public final static int BLUE = 44;
	public final static int RED = 41;

	public static void main(String[] args) throws InterruptedException {
		int width = 60;

		// The second and fifth parameters are really important. As well as the width.
		// The "height" allows to manipulate the size of the flag in the y-axis. The yellow one HAS to be half of the flag.
		// The "start" tells us at which position does an specific color begins. Therefore we need to make the counts with the height
		// However, this could be automated.
		FlagThread fgOne = new FlagThread(width, 8, 5, YELLOW, 1);
		FlagThread fgTwo = new FlagThread(width, 4, 30, BLUE, 9);
		FlagThread fgThree = new FlagThread(width, 4, 40, RED, 13);
		
		
		fgOne.start();
		fgTwo.start();
		fgThree.start();

		fgOne.join();
		fgTwo.join();
		fgThree.join();
		
		System.out.println(ESC + 0 + "m");
		
	}

}