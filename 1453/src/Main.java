import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] seat = new int[101];
		int count =0;
		for(int i=0; i<num; i++) {
			int a = sc.nextInt();
			if(seat[a] == 0) {
				seat[a] += 1;
				}
			else {
				count +=1;
			}
		}	
		System.out.println(count);
	}

}
