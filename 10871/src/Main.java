import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int min =sc.nextInt();
		for(int i=0; i<num; i++) {
			int num_ = sc.nextInt();
				if(num_<min) {
					System.out.print(num_+" ");
				}
		}
				
		
	}

}
