import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[51];
		int cnt =-1;
		for(int i=0; i<a; i++) {
			int c =sc.nextInt();
			b[c] ++;
		}
		for(int j=0; j<51; j++) {
			if(j ==b[j]) {
				cnt = j;
			}
		}
		if(cnt == -1)
			System.out.print(-1);
		else
			System.out.print(cnt);
	}

}
