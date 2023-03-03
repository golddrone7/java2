package interfaceex;

interface Cryable{
	abstract public void cry();
}

interface Flyable {
	abstract public void fly();
}

class Eagle implements Cryable, Flyable{

	@Override
	public void fly() {
		System.out.println("독수리가 날아다녀요~");
	}

	@Override
	public void cry() {
		System.out.println("까~악~~");
	}
	
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		Eagle eg = new Eagle();
		eg.cry();
		eg.fly();
	}
}


//abstract class Cryable{
//	abstract public void cry();
//}
//
//abstract class Flyable {
//	abstract public void fly();
//}
//
//class Eagle extends Flyable{
//
//	@Override
//	public void fly() {
//		System.out.println("독수리가 날아다녀요~");
//		new CryableEx().cry();
//	}
//	
//	class CryableEx extends Cryable{
//		@Override
//		public void cry() {
//			System.out.println("까~악~~");
//		}
//	}
//}
//
//
//
//public class InterfaceEx2 {
//
//	public static void main(String[] args) {
//		new Eagle().fly();
//	}
//
//}
