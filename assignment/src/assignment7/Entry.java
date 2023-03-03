package assignment7;

/*
	(1)클래스명: Entry
   -word:String 
   +Entry()                               ==>  ***약어사전***  출력
   +Entry(word:String)        ==>  Entry()호출 
   +writeView():void              ==>  약어출력
*/
public class Entry {
	private String word;
	public Entry() {
		System.out.println("***약어사전***");
	}
	
	public Entry(String word) {
		this();
		this.word = word;
	}
	
	public void wrtieView() {
		System.out.println("약어출력 : " + word);
	}
}
