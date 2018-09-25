
public class Player {
	private String name;
	private String skill;
	
	public Player(String name, String skill) {
		this.name = name;
		this.skill = skill;
	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSkill() {
		return skill;
	}



	public void setSkill(String skill) {
		this.skill = skill;
	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj != null && getClass() == obj.getClass()) {
			Player p = (Player) obj;
			return this.name.equals(p.name);
		}
		return false;
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}

	
	
	
}
