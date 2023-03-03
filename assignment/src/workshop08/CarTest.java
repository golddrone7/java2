package workshop08;

public class CarTest {
	public static void main(String[] args) {
		Car[] car = new Car[2];
		car[0] = new L3("L3", "1500", 50, 25, 0);
		car[1] = new L5("L5", "2000", 75, 35, 0);
		System.out.println("vehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(car[0].getName()+"\t\t"+car[0].getEngine() + "\t\t" + car[0].getOilTank() + "\t" + car[0].getOilSize() + "\t"+car[0].getDistance() +"\t\t"+ ((L3) car[0]).getTempGage());
		System.out.println(car[1].getName()+"\t\t"+car[1].getEngine() + "\t\t" + car[1].getOilTank() + "\t" + car[1].getOilSize() + "\t"+car[1].getDistance() +"\t\t" +((L5) car[1]).getTempGage());
		System.out.println();
		car[0].setOil(25);
		car[1].setOil(25);
		System.out.println("25주유");
		System.out.println();
		System.out.println("vehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(car[0].getName()+"\t\t"+car[0].getEngine() + "\t\t" + car[0].getOilTank() + "\t" + car[0].getOilSize() + "\t"+car[0].getDistance() +"\t\t"+ ((L3) car[0]).getTempGage());
		System.out.println(car[1].getName()+"\t\t"+car[1].getEngine() + "\t\t" + car[1].getOilTank() + "\t" + car[1].getOilSize() + "\t"+car[1].getDistance() +"\t\t" +((L5) car[1]).getTempGage());
		System.out.println();
		car[0].go(80);
		car[1].go(80);
		System.out.println("80주행");
		System.out.println();
		System.out.println("vehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(car[0].getName()+"\t\t"+car[0].getEngine() + "\t\t" + car[0].getOilTank() + "\t" + car[0].getOilSize() + "\t"+car[0].getDistance() +"\t\t"+ ((L3) car[0]).getTempGage());
		System.out.println(car[1].getName()+"\t\t"+car[1].getEngine() + "\t\t" + car[1].getOilTank() + "\t" + car[1].getOilSize() + "\t"+car[1].getDistance() +"\t\t" +((L5) car[1]).getTempGage());
		
		
	}
}
