package workshop13;

public abstract class Ship {
	private String shipName; // 배 
	private int fuelTank;	// 연료
	
	public Ship() {
	}
	public Ship(String shipName, int fuelTank) {
		super();
		this.shipName = shipName;
		this.fuelTank = fuelTank;
	}
	public abstract void sail(int dist);
	public abstract void refuel(int fuel);
	
	
	public void setFuelTank(int fuelTank) {
		this.fuelTank = fuelTank;
	}
	public int getFuelTank() {
		return fuelTank;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public String getShipName() {
		return shipName;
	}
}
