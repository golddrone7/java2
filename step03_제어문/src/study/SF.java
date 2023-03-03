package study;

class SF extends Book{
    public String name;
    public String publisher; 
    SF(String name, String publisher){
        super(name, publisher);
    }
    @Override
    void print(){
        System.out.println("print : SF");
    }
}
