import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int total = 1;
		int[] cnt = new int[10];
		for(int i=0; i<3; i++) {
			int num =sc.nextInt();
			total *=num;
			
			}
		String count = Integer.toString(total);
		for(int j=0; j<count.length(); j++) {
			cnt[(count.charAt(j)-'0')] ++;
	}
		for(int result:cnt) {
			System.out.println(result);
		}
	}
}
