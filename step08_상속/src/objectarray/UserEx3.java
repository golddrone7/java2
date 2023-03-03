package objectarray;

public class UserEx3 {
	public static void main(String[] args) {
		User[] ob = new User[] {
		  new User("둘리", "강남구"),
		  new User("도우너", "강동구"),
		  new User("마이콜", "강서구")
		}; // 가끔씩 사용
		
		User[][] ob2 = new User[][] {
				  {new User("둘리", "강남구"), new User("도우너", "강동구"),new User("마이콜", "강서구")},
				  {new User("둘리2", "강남구2"),new User("도우너2", "강동구2"),new User("마이콜2", "강서구2")},
				  {new User("둘리3", "강남구3"),new User("도우너3", "강동구3"),new User("마이콜3", "강서구3")}
				};
		for(User us : ob) {
			System.out.println(us.getName() + "\t" + us.getAddr());
		}
		
		System.out.println();
		
		for(User[] us : ob2) {
			for(User uss : us) {
				System.out.println(uss.getName() + "\t" + uss.getAddr());
			}
		}
	}
}
