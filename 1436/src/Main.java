import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int a = 666;
		int cnt =0;
		while(cnt!=num) {
			if(Integer.toString(a).contains("666")) {
				cnt+=1;
						}
			a+=1;
		}
		System.out.print(a-1);
	}

}
