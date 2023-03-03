package workshop09;

public class StudentTest {

	public static void main(String[] args) {
		double ageAvg=0, heightAvg=0, weightAvg=0;
		
		Student studentArray [] = new Student[3];
		studentArray[0] = new Student("홍길동", 15, 170, 80);
		studentArray[1] = new Student("한사람", 13, 180, 70);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
		int maxAge = studentArray[0].getAge();
		int minAge = studentArray[0].getAge();
		int maxHeight = studentArray[0].getHeight();
		int minHeight = studentArray[0].getHeight();
		int maxWeight = studentArray[0].getWeight();
		int minWeight = studentArray[0].getWeight();
		
		String maxAgeStudent = studentArray[0].getName(), minAgeStudent= studentArray[0].getName(), maxHeightStudent= studentArray[0].getName(), minHeightStudent= studentArray[0].getName(), maxWeightStudent= studentArray[0].getName(), minWeightStudent= studentArray[0].getName();
		

		System.out.println("이름\t나이\t신장\t몸무게");
		for(Student s : studentArray) {
			System.out.println(s.studentInfo());
			ageAvg += s.getAge();
			heightAvg += s.getHeight();
			weightAvg += s.getWeight();
			
			if(maxAge<s.getAge()) {
				maxAge = s.getAge();
				maxAgeStudent = s.getName();
			}
			
			if(minAge>s.getAge()) {
				minAge = s.getAge();
				minAgeStudent = s.getName();
			}
			
			if(maxHeight<s.getHeight()) {
				maxHeight = s.getHeight();
				maxHeightStudent = s.getName();
			}
			
			if(minHeight>s.getHeight()) {
				minHeight = s.getHeight();
				minHeightStudent = s.getName();
			}
			
			if(maxWeight<s.getWeight()) {
				maxWeight = s.getWeight();
				maxWeightStudent = s.getName();
			}
			
			if(minWeight>s.getWeight()) {
				minWeight = s.getWeight();
				minWeightStudent = s.getName();
			}
			
			
		}
		System.out.println();
		ageAvg /= studentArray.length;
		System.out.printf("나이 평균 : %.3f\n", ageAvg);
		heightAvg /= studentArray.length;
		System.out.printf("신장 평균 : %.3f\n", heightAvg);
		weightAvg /= studentArray.length;
		System.out.printf("몸무게 평균 : %.3f\n", weightAvg);
		System.out.println();
		System.out.println("나이가 가장 많은 학생 : " + maxAgeStudent);
		System.out.println("나이가 가장 적은 학생 : " + minAgeStudent);
		System.out.println("신장이 가장 큰 학생 : " + maxHeightStudent);
		System.out.println("신장이 가장 적은 학생 : " + minHeightStudent);
		System.out.println("몸무게가 가장 많이 나가는 학생 : " + maxWeightStudent);
		System.out.println("몸무게가 가장 적게 나가는 학생 : " + minWeightStudent);
	}

}
