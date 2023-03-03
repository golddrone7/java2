package assignment5_230106;

/*
[문제33]다중클래스를 만들고 setter & getter를 이용하여 다음을 완성하시오
(1)클래스명:  BookShop
    -bname:String   (책이름)
    -author:String   (저자) 
    -price:int          (가격) 
    +setBook(bname:String,  auth  or:String, price:int):void
    +viewBook():void
    +setter & getter

(2)조건
    1) Test33클래스의 main()메서드에서 BookShop 클래스로 객체 ob를 만든다
    2) setBook("자바완성","황완성",25000)로 값을 대입한후 viewBook()메서드로 출력한다
    3) setBname("JSP잡기"),  setAuthor("송JP"), setPrice(3500)로 값을 대입한후
         getBname(), getAuthor(), getPrice()로 출력한다

[출력화면]
책이름 : 자바완성
저  자 : 황완성
가  격 : 25000원

책이름 : JSP잡기
저  자 : 송JP
가  격 : 35000원


*/
public class Problem33 {
	public static void main(String[] args) {
		BookShop java = new BookShop();
		java.setBook("자바완성", "황인성", 25000);
		java.viewBook();
		System.out.println();
		
		BookShop jsp = new BookShop();
		jsp.setBname("JSP잡기");
		jsp.setAuthor("송JP");
		jsp.setPrice(35000);
		jsp.viewBook();
	}
}
