import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 = 0;
		int sum2 = 0;
		Scanner sc =new Scanner(System.in);
		for(int i =0; i<4; i++) 
			sum1 += sc.nextInt();
		for (int j =0; j<4; j++)
			sum2 +=sc.nextInt();
		System.out.println(sum1>=sum2 ? sum1:sum2);
	}

}
