import java.util.Date;


public class Match implements Comparable<Match> {
	private Date matchDate;
	private String teamOne;
	private String teamTwo;
	
	public Match(Date matchDate, String teamOne, String teamTwo) {
		this.matchDate = matchDate;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}

	public Date getMatchDate() {
		return matchDate;
	}



	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}



	public String getTeamOne() {
		return teamOne;
	}



	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}



	public String getTeamTwo() {
		return teamTwo;
	}



	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}



	public int compareTo(Match m) {
		// TODO Auto-generated method stub
		if (matchDate.before(m.getMatchDate())) {
			return 1;
		} else if (matchDate.equals(m.getMatchDate())) {
			return 0;
		} else {
			return -1;
		}
	}

	
}
