import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=0; i<n; i++) {
			double b= sc.nextDouble();
		System.out.printf("$%.2f",(b*0.8));
		System.out.println();
		
		}
	}

}
