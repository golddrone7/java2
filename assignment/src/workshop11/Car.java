package workshop11;

public class Car extends Vehicle {
	private double restOil;
	private int curWeight;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	public void addOil(int oil) {
		if(getOilTankSize()<restOil+oil)
			return;
		restOil+=oil;
	}
	public void moving(int distance) {
		restOil-=distance/getEfficiency();   //연비 5km 당 1L감소
	}
	public void addWeight(int weight) {
		if(getMaxWeight()<curWeight+weight)
			return;
		curWeight+=weight;
	}
	
	public String toString() {
		return super.toString()+restOil+"\t\t"+curWeight+"\t\t";
	}
	public double getRestOil() {
		return restOil;
	}

	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}

	public int getCurWeight() {
		return curWeight;
	}

	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
	
	
	
	
}
