import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Match> rs = new TreeSet();
		System.out.println("Enter the number of matches");
		int n = sc.nextInt();
		sc.nextLine();
		SimpleDateFormat ft = new SimpleDateFormat("MM-dd-yyyy");
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter match date in (MM-dd-yyyy)");
			String date = sc.nextLine();
			System.out.println("Enter Team 1");
			String team1 = sc.nextLine();
			System.out.println("Enter Team 2");
			String team2 = sc.nextLine();
			
			Date d = null;
			try {
				d = ft.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rs.add(new Match(d, team1, team2));
		}
		System.out.println("Match Details");
		int index = 1;
		for (Match r : rs) {
			System.out.println("Team 1 " + r.getTeamOne());
			System.out.println("Team 2 " + r.getTeamTwo());
			System.out.println("Match held on " + ft.format(r.getMatchDate()));
		}
		
		
	}

}
