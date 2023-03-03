package workshop11;

public class Vehicle {
	private int maxWeight;
	private double oilTankSize;
	private double efficiency;
	
	public Vehicle() {
	}

	public Vehicle(int maxWeight, double oilTankSize, double efficiency) {
		super();
		this.maxWeight = maxWeight;			//최대적재량
		this.oilTankSize = oilTankSize;		//최대오일탱크사이즈
		this.efficiency = efficiency;		//효율
	}

	
	
	@Override
	public String toString() {
		return maxWeight + "\t\t" + oilTankSize+"\t\t";
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getOilTankSize() {
		return oilTankSize;
	}

	public void setOilTankSize(double oilTankSize) {
		this.oilTankSize = oilTankSize;
	}

	public double getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}

}
