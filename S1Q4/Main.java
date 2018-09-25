import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		Set<Revenue> revenueSet = new TreeSet();
		String cont = "yes";
		while (!cont.equals("no")) {
			System.out.println("Enter revenue category");
			String cat = sc.nextLine();
			System.out.println("Enter revenue amount");
			int amount = sc.nextInt();
			sc.nextLine();
			revenueSet.add(new Revenue(cat, amount));
			System.out.println("Do you want to continue(yes/no):");
			cont = sc.nextLine();
		}
		int total = 0;
		System.out.println("Top spending categories");
		System.out.println(String.format("%-15s%-15s", "Category", "Amount"));
		for (Revenue r : revenueSet) {
			total += r.getAmount();
			System.out.println(String.format("%-15s%-15s", r.getRevenueCategory(), r.getAmount()));
		}
		System.out.println("Total amount earned: " + total);
	}

}
