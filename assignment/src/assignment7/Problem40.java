package assignment7;

/*
	(1)클래스명: Entry
   -word:String 
   +Entry()                               ==>  ***약어사전***  출력
   +Entry(word:String)        ==>  Entry()호출 
   +writeView():void              ==>  약어출력

(2)클래스명: SubEntry   ==> Entry를 상속받음
   -definition:String  
   -year:int
   +SubEntry()
   +SubEntry(word:String)                                                   ==> Entry(String word)   호출 
   +SubEntry(word:String, definition:String, year:int)   ==> SubEntry(String word)호출
   +printView():void                                                                 ==> 원어, 시기출력

(3)Test40클래스의  main()함수에서
    SubEntry ob=new SubEntry("OOP","Object Oriented Programming", 1991);
    ob.writeView();
    ob.printView();
*/
public class Problem40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SubEntry ob=new SubEntry("OOP","Object Oriented Programming", 1991);
		    ob.wrtieView();
		    ob.printView();
	}

}
