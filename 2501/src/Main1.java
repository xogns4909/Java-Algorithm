import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		for(int i =1; i<=a; i++) {
			if(a%i==0) {
				count+=1;
				if(count == b) {
					System.out.print(i);
				break;
				}
			}
			
		}
		if(count < b)
			System.out.print(0);
	}

}
