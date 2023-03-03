package assignment8_230111;

import java.util.Scanner;

/*
[문제46] 동적바인딩(Dynamic Binding)을 이용하여 다음 프로그램을 완성하시오
(1)클래스명 : Shape
   -nData1:int
   -nData2:int
   +Shape(int data1, int data2)
    +getter    
    +getArea():double            ==> abstract 
(2)클래스명 : Triangle              ==> Shape를 상속받음
   +Triangle(data1:int, data2:int)
   +getArea():double 
(4)클래스명 : Rectangle           ==> Shape를 상속받음
   +Rectangle(data1:int, data2:int)
   +getArea():double

(5)Test46클래스의 main()메서드에서 아래코드외에 나머지를 완성하시오
   Shape ob=null;
   Scanner sc=new Scanner(System.in);
   while(true){
             System.out.print("1.삼각형 2. 사각형  3. 종  료\n선택(1-3)");
             int n=sc.nextInt();
	                 :
   }

[결과화면]
1. 삼각형  2. 사각형  3. 종  료
선택(1-3) : 1
밑변 : 2
높이 : 3
넓이 : 6.00


1. 삼각형  2. 사각형  3. 종  료
선택(1-3) : 2
가로 : 4
세로 : 5
넓이 : 20

*/
public class Problem46 {
	public static void main(String[] args) {
		int x, y;
		 Shape ob=null;
		   Scanner sc=new Scanner(System.in);
		   while(true){
		             System.out.print("1.삼각형 2. 사각형  3. 종  료\n선택(1-3)");
		             int n=sc.nextInt();
		             switch(n) {
		             case 1 : 
		            	 System.out.print("밑변 : ");
		            	 x = sc.nextInt();
		            	 System.out.print("높이 : ");
		            	 y = sc.nextInt();
		            	 ob = new Triangle(x,y);
		            	 break;
		             case 2: 
		            	 System.out.print("가로 : ");
		            	 x = sc.nextInt();
		            	 System.out.print("세로 : ");
		            	 y = sc.nextInt();
		            	 ob = new Rectangle(x,y);
		            	 break;
		             default:
		            	 System.out.println("***** 종료 *****");
		            	 sc.close();
		            	 System.exit(0);
		             }
		             System.out.println("넓이 : " + ob.getArea());
		   }
	}
}
