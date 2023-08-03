import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int[] size={64,32,16,8,4,2,1}; 
		int w = sc.nextInt();
		int cnt =0;
			for(int i=0; i<7; i++) {
				if(size[i]<=w) {
					w -= size[i];
					cnt+=1;
				}
			}
	
		System.out.print(cnt);
	}

}
