package workshop01;

public class Problem6 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = 30;
		char ch = 'A';
		ch = 'C';
		float f = 1.5f;
		long l = 27000000000L;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d<0.5 ? true : false ;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}
	/*
		출력은 아래와 같이 이루어 진다.
		c=30
		ch=C
		f=1.5
		l = 27000000000
		result=true
	*/
}
