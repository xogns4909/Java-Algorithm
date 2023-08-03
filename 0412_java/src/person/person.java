package person;

public class person {

	    String userName = "gini";
	    String carName = "제네시스";
public person(String userName, String carName) {
	        this.userName = userName; //CarOrder 클래스에만 돌아가는 this
	        this.carName = carName;

	    }

	    public void orderCarInfo() {
	        System.out.println("******** 주문 차랑 *******");
	        System.out.println(userName+" : "+carName);
	    }
	    public static void main(String[] args) {

	        person co = new person("seyul", "미니쿠퍼");
	        co.orderCarInfo();
	    }
	}
	