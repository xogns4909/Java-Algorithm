import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b = sc.nextInt();
		int n =b;
		int min=0;
		while(true) {
			if(n%a==0&&n%b==0) {
				break;
			}
			else
				n+=1;
		}
		for(int i =a; i>1; i--) {
			if(a%i ==0 && b%i==0) {
				min = i;
				break;
			}
		}
		System.out.println(min);
		System.out.println(n);
	}

}
