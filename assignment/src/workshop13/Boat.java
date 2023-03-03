package workshop13;

public class Boat extends Ship {

	public Boat() {
		// TODO Auto-generated constructor stub
	}
	public Boat(String shipName, int fuelTank) {
		super(shipName, fuelTank);
	}
	
	@Override
	public void sail(int dist) {	//운항
		setFuelTank(getFuelTank()-10*dist);
	}

	@Override
	public void refuel(int fuel) {	//주유
		setFuelTank(getFuelTank()+fuel*10);
	}
	
}
