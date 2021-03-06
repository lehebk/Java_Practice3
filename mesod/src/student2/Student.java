package student2;

public class Student {
	/*
	 * 접근 제한 자 : public, default, protected, private
	 * public : 누구나 접근 가능
	 * private : 클래스 내에서만 접근이 가능함. 다른 클래스에서는 접근 불가능
	 * 앞으로 필드에 붙여서 사용(다른 클래스에서 필드에 직접
	 * */
	private String name;
	private String phone;
	private String address;

	// 기본 생성자
	Student() {

	}

	// 매개변수 있는 생성자
	public Student(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	//name 필드의 getter
	//필드값을 가져다 쓸때
	//필드값 타입의 리턴
	public String getName() {
		return name;
	}
	//name 필드의 setter
	//필드값을 바꿀 때 
	//리턴없음.
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	// 필드는 private으로 선언하고
	// get 메소드 set 메소드를 선언하여 이 메소드를 통해
	// 필드값을 변경하고 가져오는데 활용

	
	
	
	
	
	
	
	
}
