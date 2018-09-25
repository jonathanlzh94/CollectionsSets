import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<String> people = new TreeSet();
		
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			people.add(sc.nextLine());
		}
		
		for (String s : people) {
			System.out.println(s);
		}
	}

}
