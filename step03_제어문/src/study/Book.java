package study;

class Book{
    public String name;
    public String publisher; 
    Book(){
    	this.name = "";
        this.publisher = "";
    }
    Book(String name, String publisher){
        this.name = name;
        this.publisher = publisher;
    }
    void print(){
        System.out.println("print : Book");
    }; 
}