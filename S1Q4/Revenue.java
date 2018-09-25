 	
public class Revenue implements Comparable<Revenue> {
	private String revenueCategory;
	private int amount;
	
	public Revenue(String revenueCategory, int amount) {
		this.revenueCategory = revenueCategory;
		this.amount = amount;
	}

	public String getRevenueCategory() {
		return revenueCategory;
	}

	public void setRevenueCategory(String revenueCategory) {
		this.revenueCategory = revenueCategory;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public int compareTo(Revenue r) {
		if (this.amount > r.amount) {
			return -1;
		} else if (this.amount == r.amount){
			return 0;
		} else {
			return 1;
		}
	}
	
	
}
