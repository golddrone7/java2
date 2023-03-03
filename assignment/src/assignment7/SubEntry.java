package assignment7;

/*
(2)클래스명: SubEntry   ==> Entry를 상속받음
   -definition:String  
   -year:int
   +SubEntry()
   +SubEntry(word:String)                                                   ==> Entry(String word)   호출 
   +SubEntry(word:String, definition:String, year:int)   ==> SubEntry(String word)호출
   +printView():void           

*/
public class SubEntry extends Entry {
	private String definition;
	private int year;
	
	public SubEntry() {
		
	}	
	
	public SubEntry(String word) {
		super(word);
	}

	public SubEntry(String word, String definition, int year) {
		this(word);
		this.definition = definition;
		this.year = year;
	}
	
	public void printView() {
		System.out.println("원어 : " + definition);
		System.out.println("시기 : " + year);
	}
}
