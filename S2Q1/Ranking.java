
public class Ranking implements Comparable<Ranking> {
	private String name;
	private long score;
	
	public Ranking(String name, long score) {
		this.name = name;
		this.score = score;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public long getScore() {
		return score;
	}



	public void setScore(long score) {
		this.score = score;
	}



	public int compareTo(Ranking r) {
		// TODO Auto-generated method stub
		if (score > r.getScore()) {
			return -1;
		} else if (score == r.getScore()) {
			return 0;
		} else {
			return 1;
		}
	}

	
}
