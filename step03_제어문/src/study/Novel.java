package study;

class Novel extends Book{
    public String name;
    public String publisher; 
    Novel(String name, String publisher){
        super(name, publisher);
    }
    @Override
    void print(){
        System.out.println("print : Novel");
    }
}