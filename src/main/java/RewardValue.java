
public class RewardValue {
	
	private double cash;
	private int miles;
	public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
	
	public RewardValue(double cash) {
		this.cash = cash;
	}

	public RewardValue(int miles) {
		this.miles = miles;
	}
	
	public RewardValue(double cash, int miles) {
		this.cash = cash;
		this.miles = miles;
	}
	
	public double getCashValue() {
		return convertToCash(this.miles);
	}
	
	public double getMilesValue() {
		return convertToMiles(this.cash);
	}

	private static double convertToMiles(double cash) {
		
		return  (int) (cash/MILES_TO_CASH_CONVERSION_RATE);
		 	
	}
	
	private static double convertToCash(int miles) {
		
		return  (miles*MILES_TO_CASH_CONVERSION_RATE);
		
	}

}
