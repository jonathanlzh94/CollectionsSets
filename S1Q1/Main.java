import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<String> people = new HashSet();
		
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			people.add(sc.nextLine());
		}
		
		System.out.println(people.stream().count());
	}

}
