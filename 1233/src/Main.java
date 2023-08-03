import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int[] count =new int[a+b+c+1];
		int max =0;
		int result =0;
		for(int i=1; i<=a;i++) {
			for(int j=1; j<=b; j++) {
				for(int k=1; k<=c; k++) {
					count[i+j+k] +=1;
			}
		}
	}
		for(int l=3; l< count.length; l++) {
			if(count[l]>max) {
				max =count[l];
				result = l;
			}
		}
		System.out.println(result);
}
}