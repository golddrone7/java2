package algorithm;
class Person{
	private static Person instance;
	
	private Person() {
		throw new IllegalStateException("Private Constructor");
	}
	
	public static Person getInstance() {
		if(instance==null) {
			instance=new Person();
		}
		return instance;
	}
}



public class Singleton {
	private Singleton() {}
	
	public static Singleton getInstance() {
		return LazyHolder.INSTANCE;
	}
	private static class LazyHolder{
		private static final Singleton INSTANCE = new Singleton();
	}

}
