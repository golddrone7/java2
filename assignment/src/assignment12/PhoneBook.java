package assignment12;

public class PhoneBook {
	private String phone;
	private String address;
	
	
	public PhoneBook(String phone, String address) {
		super();
		this.phone = phone;
		this.address = address;
	}


	@Override
	public String toString() {
		return "연락처 : "+phone+"\n주소: "+address;
	}
	
}
