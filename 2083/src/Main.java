import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			String name =sc.next();
			int age = sc.nextInt();
			int weight = sc.nextInt();
			if(name.equals("#") && age == 0 && weight ==0) {
				break;
			}
			else if(age > 17 || weight >= 80) {
				System.out.printf("%s"+" "+"Senior\n",name);	
			}
			else
				System.out.printf("%s"+" "+"Junior\n",name);
			
		}
	}

}
