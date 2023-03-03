package polymorphism;

public class Test {
	public static void func(People people) {	// People people = new woman();
		people.printInfo(); 	// man.printInfo(), woman.printInfo()
		if(people instanceof Man)
			((Man)people).enlist();
		
		if(people instanceof Woman)
			((Woman)people).makeUp();
		
	}
	public static void main(String[] args) {
//        Man man=new Man();
//        Woman woman=new Woman();
//         
//        man.printInfo();
//        System.out.println();
//        woman.printInfo();

//    	People people = new Man();
//    	people.printInfo();
//    	
//    	people = new Woman();
//    	people.printInfo();

//		People people = new Man();
//		people.printInfo();
//		((Man) people).enlist();
//
//		System.out.println();
//
//		people = new Woman();
//		people.printInfo();
//		((Woman) people).makeUp();
		
	    Man man=new Man();
	    Woman woman=new Woman();
	    func(man);
	    System.out.println();
	    func(woman);
	}
}
