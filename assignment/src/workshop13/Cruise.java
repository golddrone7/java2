package workshop13;

public class Cruise extends Ship{	
	public Cruise() {
	}
	public Cruise(String shipName, int fuelTank) {
		super(shipName, fuelTank);
	}
	@Override
	public void sail(int dist) {	// 운항
		setFuelTank(getFuelTank()-13*dist);
	}
	@Override
	public void refuel(int fuel) {	// 주유
		setFuelTank(getFuelTank()+fuel*8);
	}

	
}
