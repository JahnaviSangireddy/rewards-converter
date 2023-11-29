
public class RewardValue {
	
	private double cash;
	private double miles;
	
	public RewardValue(double cash) {
		this.cash = cash;
	}

	public RewardValue(double cash, double miles) {
		this.miles = miles;
	}
	
	public double getCashValue() {
		return cash;
	}
	
	public double getMilesValue() {
		miles =  (cash / 0.0035);
		return miles;
	}
	

}
