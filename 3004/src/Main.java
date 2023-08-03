import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		if(a % 2 == 1) 
			System.out.print(((a-1)/2+1)*((a+1)/2+1));
		else
			System.out.print((Math.pow((a/2)+1,2)));
	}

}
