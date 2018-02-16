import java.util.Scanner;

public class Player {
	public Player(String playername) {
		//System.out.print(playername);
	}

	public static void main(String args[]) {
		System.out.print("Name: ");
		Scanner name = new Scanner(System.in);
		String playername = name.next();
		System.out.print("At Bats: ");
		Scanner atbats = new Scanner(System.in);
		short ab = atbats.nextShort();
		System.out.print("Hits: ");
		Scanner hits = new Scanner(System.in);
		float h = hits.nextFloat();
		System.out.print("Doubles: ");
		Scanner doubles = new Scanner(System.in);
		short twob = doubles.nextShort();
		System.out.print("Triples: ");
		Scanner triples = new Scanner(System.in);
		short threeb = triples.nextShort();
		System.out.print("Home Runs: ");
		Scanner homeruns = new Scanner(System.in);
		short hr = homeruns.nextShort();
		System.out.print("Runs: ");
		Scanner runs = new Scanner(System.in);
		short r = runs.nextShort();
		System.out.print("Walks: ");
		Scanner walks = new Scanner(System.in);
		short bb = walks.nextShort();
		
		float b = (float) (h-twob-threeb-hr);
		
		public float battingAverage()
		{
			return this.h/this.ab
		}
		public float OBS()
		{
			return this.h+this.bb/
		}
		System.out.println(playername);
		System.out.print("Batting Average: ");
		System.out.println(h/ab);
		System.out.print("On base Percentage: ");
		System.out.println((h+bb)/(ab+bb));
		System.out.print("Slugging Percentage: ");
		System.out.println((b+2*twob+3*threeb+4*hr)/ab);
		System.out.print("On base + Slugging Percentage: ");
		System.out.println((b+2*twob+3*threeb+4*hr)/ab+(h+bb)/(ab+bb));
		System.out.print("Total bases: ");
		System.out.println(b+2*twob+3*threeb+4*hr);
	}
}
