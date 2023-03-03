package instance;

//직군별로 보너스를 다르게 지급, 현실적으론 데이터형으로 구분함

abstract class Employee{
	String name;
	int salary;
	
	public Employee() {
	}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	abstract public int getBonus(); // 정규보너스

	@Override
	public String toString() {
		return name + "\t"+salary;
	}
}

class Engineer extends Employee{

	public Engineer() {
		super();
	}

	public Engineer(String name, int salary) {
		super(name, salary);
	}

	@Override
	public int getBonus() {
		return 150000;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t\t" + getBonus();
	}
	
}

class Developer extends Employee{

	public Developer() {
		super();
	}

	public Developer(String name, int salary) {
		super(name, salary);
	}

	@Override
	public int getBonus() {
		return 100000;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t\t" + getBonus();
	}
	
}



public class InstanceofEx2 {

	public static void main(String[] args) {
		
		// 부모 클래스의 참조변수로 자식객체 생성
		Employee[] em =   {new Engineer("둘리", 1200000),
						   new Developer("도우너", 1000000), 
						   new Engineer("마이콜", 1400000),
						   new Developer("고길동", 1600000)};
		// 엔지니어는 급여의 13%, 디벨로퍼는 15%의 특별보너스를 지급
		System.out.println("이름\t급여\t\t정규보너스\t특별보너스");
		
		
		for(Employee i : em) {
			if(i instanceof Engineer) {
				System.out.println(i.toString() +"\t" +(int)(i.salary * 0.13));
			}
			if(i instanceof Developer) {
				System.out.println(i.toString() +"\t" +(int)(i.salary * 0.15) );
			}
			
			
			
		}
		
		
		
	}

}
