import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		int tem = 1;
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0; i<a; i++) {
			int b = sc.nextInt();
			if(b == 1) {
				result+=tem;
				tem +=1;
			}
			else
				tem =1;
			
		}
		System.out.println(result);
	}

}
