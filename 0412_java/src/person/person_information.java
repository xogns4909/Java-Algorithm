package person;

public class person_information {
	private String name = "hoon";
	private int age = 24;
	private String phone_number ="010-4909-0276";
	
	public void print() {
		System.out.print(name+" "+age+" "+phone_number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person_information hoon= new person_information();
		hoon.name="hoon";
		System.out.print(hoon.name);
	}

	}
