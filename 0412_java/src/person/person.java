package person;

public class person {

	    String userName = "gini";
	    String carName = "���׽ý�";
public person(String userName, String carName) {
	        this.userName = userName; //CarOrder Ŭ�������� ���ư��� this
	        this.carName = carName;

	    }

	    public void orderCarInfo() {
	        System.out.println("******** �ֹ� ���� *******");
	        System.out.println(userName+" : "+carName);
	    }
	    public static void main(String[] args) {

	        person co = new person("seyul", "�̴�����");
	        co.orderCarInfo();
	    }
	}
	