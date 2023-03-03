package assignment7;

/*
**** x,y,z에 값채우기***
10을 넘겨받은 생성자
10   20   을 넘겨받은 생성자
10   20   30  을 넘겨받은 생성자
10   20   30
합 : 60
*/
class SuperEx
{
	int x,y,z;
	
	public SuperEx(){
		System.out.println("**** x,y,z에 값채우기***");
	}
	public SuperEx(int k){
		this();
		System.out.println(k + "을 넘겨받은 생성자");
	}
	public SuperEx(int a, int b){
		this(a);
		System.out.println(a + "   " +b+"   을 넘겨받은 생성자");
	}
	public SuperEx(int x,int y,int z){
							this(x,y);
							this.x = x;
							this.y = y;
							this.z = z;
                            System.out.println(x+ "   " +y+"   " +z+"   을 넘겨받은 생성자");
	}
	public void display(){
		System.out.println(this.x+"   "+this.y+"   "+this.z);
	}
}
class SubEx extends SuperEx
{
	public SubEx(int a,int b,int c){
	    super(a,b,c);	
		
	    super.display();
	    this.sumData();
	}	
	public void sumData(){
		System.out.println("합 : " + (x+y+z));
	}
}
public class Problem39 {
	public static void main(String[] args) {
		new SubEx(10,20,30);
	}
}


