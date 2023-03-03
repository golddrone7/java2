package workshop11;

public class Truck extends Car {
	public Truck() {
		// TODO Auto-generated constructor stub
	}
	
	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	public double getEfficiency() {
		setEfficiency(super.getEfficiency()-(getCurWeight()/5*0.2));
		return super.getEfficiency();
	}
	
	public void moving(int distance) {
		setRestOil(getRestOil()-calcOil(distance));
	}
	
	private double calcOil(int distance) {
		return distance/super.getEfficiency();
	}
	
	public int getCost(int distance) {
		return (int)Math.floor(calcOil(distance))*3000;
	}
	
	public String toString() {
		return super.toString()+super.getEfficiency();
	}
	
	
	
	
	
	
	
	
}
