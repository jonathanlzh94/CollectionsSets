import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String>	s1 = new HashSet();
		Set<String> s2 = new HashSet();
		System.out.println("Enter the number of top run scorers in season 4");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name of players");
		for (int i = 0; i < n; i++) {
			s1.add(sc.nextLine());
		}
		System.out.println("Enter the number of top run scorers in season 5");
		int m = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name of players");
		for (int j = 0; j < m; j++) {
			s2.add(sc.nextLine());
		}
		
		System.out.println("Player Set 1");
		for (String p : s1) {
			System.out.println(p);
		}
		System.out.println("Player Set 2");
		for (String p : s2) {
			System.out.println(p);
		}
		System.out.println("Intersection");
		s1.retainAll(s2);
		for (String p : s1) {
			System.out.println(p);
		}
	}

}
