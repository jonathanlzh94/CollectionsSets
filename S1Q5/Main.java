import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Main {
	
	public static boolean nameExists(Set<Player> ps, String name) {
		for (Player p : ps) {
			if (p.getName().equals(name)) 
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		Set<Player> playerSet = new HashSet();
		String cont = "yes";
		while (!cont.equals("no")) {
			System.out.println("Enter Player Name:");
			String name = sc.nextLine();
			System.out.println("Enter Skill:");
			String skill = sc.nextLine();
			if (nameExists(playerSet, name)) {
				System.out.println("Player " + name + " already exist");
			} else {
				Player p = new Player(name, skill);
				playerSet.add(p);
			}
			
			System.out.println("Do you want to continue(yes/no):");
			cont = sc.nextLine();
		}
		TreeSet<Index> indexSet = IndexBuilder.buildIndex((HashSet)playerSet);
		IndexBuilder.displayIndex(indexSet);
	}

}
