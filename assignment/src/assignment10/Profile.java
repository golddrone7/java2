package assignment10;

/*
(1)클래스명 : Profile
    +name:String
    +phone:String

    +Profile()
    +Profile(name:String,phone:String)
    +printView():void         //이름,연락처출력

*/
public class Profile {	
	public String name;
	public String phone;
	
	public Profile() {
		// TODO Auto-generated constructor stub
	}

	public Profile(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public void printView() {
		System.out.println("이름 : " + name);
		System.out.println("연락처 : " + phone);
	}

}
