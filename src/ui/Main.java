package ui;

import thread.FlagThread;

public class Main {
	
	public final static String ESC   = "\u001b[";
	public final static String UP    = ESC+"A";
	public final static String DOWN  = ESC+"B";
	public final static String RIGHT = ESC+"C";
	public final static String LEFT  = ESC+"D";
	public final static String NXLN  = ESC+"1E";

	public final static int YELLOW = 43;
	public final static int BLUE = 44;
	public final static int RED = 41;
	
	public final static int[] TEXT_FORMAT = new int[] 
			{0,1,22,4,24,27,31,32,33,34,35,36,37,
			 40,41,42,43,44,45,46,47,48,90,91,92,93,94,
			 95,96,97,100,101,102,103,104,105,106,107};

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