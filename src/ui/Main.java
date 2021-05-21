package ui;

public class Main {
	
	public final static String ESC   = "\u001b[";
	public final static String UP    = ESC+"A";
	public final static String DOWN  = ESC+"B";
	public final static String RIGHT = ESC+"C";
	public final static String LEFT  = ESC+"D";
	public final static String NXLN  = ESC+"1E";

	public final static int YELLOW = 31;
	public final static int BLUE = 91;
	public final static int RED = 104;
	
	public final static int[] TEXT_FORMAT = new int[] 
			{0,1,22,4,24,27,31,32,33,34,35,36,37,
			 40,41,42,43,44,45,46,47,48,90,91,92,93,94,
			 95,96,97,100,101,102,103,104,105,106,107};

	public static void main(String[] args) throws InterruptedException {
		//char ch = '*';
		//int sleep = 50;
		//int width = 1;
		//int max = 30;
		//int color = 0;

		
		System.out.print(ESC+"2J");//Clear screen
		System.out.print(ESC+"0G"+ESC+"0d");//Cursor in 0,0
		
		//System.out.print(ESC+TEXT_FORMAT[color]+"m"+ch);
		//Thread.sleep(sleep);
		//color = 34;
		//System.out.print(ESC+TEXT_FORMAT[color]+"m"+ch);

		// TEXT_FORMAT[16] = YELLOW
		// TEXT_FORMAT[17] = BLUE
		// TEXt_FORMAT[14] = RED
		int height = 4;
		for (int j = 1; j <= height; j++) {
			int i = 0;
			while (i < 80) {
				System.out.print(ESC+TEXT_FORMAT[16]+"m" + " ");
				i++;
			}
			System.out.print(NXLN);
		}

		height = 2;
		for (int j = 1; j <= height; j++) {
			int i = 0;
			while (i < 80) {
				System.out.print(ESC+TEXT_FORMAT[17]+"m" + " ");
				i++;
			}
			System.out.print(NXLN);
		}

		for (int j = 1; j <=height; j++) {
			int i = 0;
			while (i < 80) {
				System.out.print(ESC+TEXT_FORMAT[14]+"m" + " ");
				i++;
			}
			System.out.print(NXLN);
		}

		System.out.print(ESC + "m");
	}

}