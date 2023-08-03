import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int[] size =new int[5];
		int min =100;
		for(int i=0; i<size.length; i++) {
			size[i] = sc.nextInt();
			
			
			if (min > size[i]) {
		        min = size[i];
		      }
		    }

		while(true) {
			 int cnt = 0;
			for(int j=0; j<size.length; j++) {
				if(min%size[j]==0) {
					cnt++;
				}
			}
				if(cnt>=3) {
					break;
					}
				else
					min++;
				
		}
	 System.out.print(min);
	}

}
