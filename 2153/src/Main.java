import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String a = sc.nextLine();
		int count =0;
		int c =0;
		int sum = 0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)>='a' && a.charAt(i)<='z')
				sum+=a.charAt(i)-'a'+1;
			else
				sum+=a.charAt(i)-'A'+27;
				}
			
		boolean flag =true;
		for(int j=2; j<sum; j++) {
			if(sum % j ==0) {
				flag =false;
					System.out.print("It is not a prime word.");
					break;
				}
			}
	
	if(flag) {
		System.out.print("It is a prime word.");
	}
	}

}
