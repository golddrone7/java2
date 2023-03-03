package constructor;


// 자바 호출스택 
public class CallStackTest {
	public static void firstMethod() {
    	secondMethod(); //2
    	System.out.println("firstMethod() 종료"); //4 
    }
    public static void secondMethod() {
    	System.out.println("secondMethod() 종료"); 	//3
    }
	
	public static void main(String[] args) {
    	firstMethod();	// 1
    	System.out.println("Main() 종료"); //5
    }
}