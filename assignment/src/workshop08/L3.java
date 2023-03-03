package workshop08;

public class L3 extends Car implements Temp {
	public L3() {
		// TODO Auto-generated constructor stub
	}
	
	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}

	@Override
	public int getTempGage() {
		return (int)(super.getDistance() *0.1);
	}

	@Override
	public void go(int distance) {
		super.setDistance(super.getDistance() + distance);
		super.setOilSize(super.getOilSize() - (int)(distance*0.1));
	}

	@Override
	public void setOil(int oilSize) {
		super.setOilSize(super.getOilSize() + oilSize );
	}
	
}
