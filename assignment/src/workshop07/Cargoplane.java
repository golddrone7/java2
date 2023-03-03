package workshop07;

public class Cargoplane extends Plane {
	public Cargoplane() {
		// TODO Auto-generated constructor stub
	}
	public Cargoplane(String planeName, int fuelSize) {
		// TODO Auto-generated constructor stub
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		super.setFuelSize(super.getFuelSize()-(distance*5));
	}

}
