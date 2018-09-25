import java.util.HashSet;
import java.util.TreeSet;


public class IndexBuilder {
	
	public static TreeSet<Index> buildIndex(HashSet<Player> hs) {
		TreeSet<Index> ts = new TreeSet();
		for (Player p : hs) {
			char firstLetter = p.getName().charAt(0);
			Index ind = findIndex(ts, firstLetter);
			if (ind != null) {
				ind.setCount(ind.getCount()+1);
			} else {
				ts.add(new Index(firstLetter, 1));
			}
		}
		return ts;
	}
	
	private static Index findIndex(TreeSet<Index> ts, char ch)  {
		for (Index index : ts) {
			if (ch == index.getCh()) {
				return index;
			}
		}
		return null;
	}
	
	public static void displayIndex(TreeSet<Index> ts) {
		System.out.println(String.format("%-14s%-15s", "Player", "Index"));
		for (Index i : ts) {
			System.out.println(String.format("%-15s%-15d", i.getCh(), i.getCount()));
		}
	}
}
 
