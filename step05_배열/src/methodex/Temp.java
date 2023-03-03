package methodex;

public class Temp {

	public static void view(String[] car, int a) {
		for (String s : car)
			System.out.print(s + " ");
		System.out.println();
		car[1] = "모닝";
		System.out.println(car);

	}

	public static void main(String[] args) {
		String[] car = { "아반떼", "티코", "스파크" };
		int a = 10;
		// String ab = "String 100";
		System.out.println(a);
		view(car, a);
		for (String data : car)
			System.out.print(data + " ");

		System.out.println(car[0]);
	}
}
