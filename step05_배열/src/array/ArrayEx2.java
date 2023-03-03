package array;

//1차원 배열
public class ArrayEx2 {
	public static void main(String[] args) {
		String[] car = {"소나타", "코란도", "스파크", "모닝", "아반떼"};
	
		String[][] car2D = {{"소나타", "코란도", "스파크", "모닝", "아반떼"},
				{"소나타", "코란도", "스파크", "모닝", "아반떼"},
				{"소나타", "코란도", "스파크", "모닝", "아반떼"}};	
//		for(String[] st : car2D) {
//			System.out.println(st[0]);
//		}
		
		for(int i=0; i<car2D.length; i++) {
			System.out.print("{");
			for(int j=0; j<car2D[0].length; j++) {
				System.out.print(car2D[i][j] + ",");
			}
			System.out.println("}");
		}		
		car[3]="티코";
		
//		for(String st : car) 
//			System.out.println(st);
		
//		for(int i=0; i<car.length; i++) {
//			System.out.println(car[i]);
//		}
//				
	}
}
