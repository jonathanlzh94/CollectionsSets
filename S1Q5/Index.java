
public class Index implements Comparable<Index> {
	
	private char ch;
	private int count;
	
	public Index(char ch, int count) {
		this.ch = ch;
		this.count = count;
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int compareTo(Index i) {
		if ((int) ch < (int)i.getCh()) {
			return -1;
		} else if ((int) ch == (int) i.getCh()) {
			return 0;
		} else {
			return 1;
		}
	}
	
	
}
