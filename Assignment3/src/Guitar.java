

import java.util.Scanner;

public class Guitar extends SongTutorial{
	
public void SetSongs() {
	Scanner scan = new Scanner(System.in);
	System.out.print("Please enter the name of song you want to learn: ");
	String CSong= scan.nextLine();
	System.out.println("Song that you want to learn:" + CSong);
}
public void SongList() {
	System.out.println("(For Advanced)");
	System.out.println("1.Canon in D \n2.Through The Fire and Flames");
	super.SongList();
}

}
