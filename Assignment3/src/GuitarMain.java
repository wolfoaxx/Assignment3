

import java.util.Scanner;
public class GuitarMain extends Guitar{
	public static void main(String[] args) {
		Guitar g = new Guitar();
		Scanner scan = new Scanner(System.in);
		System.out.print("Please input your First name: ");
		String Fname = scan.nextLine();
		System.out.print("Please input your Last name: ");
		String Lname = scan.nextLine();
		System.out.print("Please input your race: ");
		String race = scan.nextLine();
		System.out.print("Please input your session time you want to take (RM 10/hrs): ");
		double sessionTime = scan.nextDouble();
		
	
		
		Participant p = new Participant(Fname,Lname, race, sessionTime);
		GuitarStrings gs = new GuitarStrings('e','B','G','D','A','E');
		
		System.out.println("Participant name: " +p.toString());
		System.out.println("Participant race: " +p.getRace());
		System.out.println("Participant session time : " + p.getSessionTime() + " Hours");
		System.out.println("Total price is RM:" + p.getPrice());
		
		
		
		gs.setStrings('E','A','D','G','B','e');
		System.out.println("===================================");
		System.out.println("Your Guitar String were set to ");
		System.out.println("First string set to: " +gs.getStringsOne());
		System.out.println("Second string set to: " +gs.getStringsTwo());
		System.out.println("Third string set to: " +gs.getStringsThree());
		System.out.println("Fourth string set to: " +gs.getStringsFour());
		System.out.println("Fifth string set to: " +gs.getStringsFive());
		System.out.println("Sixth string set to: " +gs.getStringsSix());
		System.out.println("===================================");
		g.SongList();
		g.SetSongs();
		
	}
}
