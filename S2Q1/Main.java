import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Ranking> rs = new TreeSet();
		System.out.println("Please provide the number of  players");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the name of the player " + i);
			String name = sc.nextLine();
			System.out.println("Enter the score of the player " + i);
			long score = Long.parseLong(sc.nextLine());
			rs.add(new Ranking(name, score));
		}
		System.out.println("Player Details by Score(High to Low)");
		int index = 1;
		for (Ranking r : rs) {
			System.out.println(index++ + " " + r.getName() + " " + r.getScore());
		}
	}

}
