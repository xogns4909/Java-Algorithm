import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a =new Scanner(System.in);
		int num = a.nextInt();
		int[] array ={1,0,0};
		int flag =0;
		for(int i=0; i< num; i++) {
			int b = a.nextInt();
			int c = a.nextInt();
			
			flag = array[b-1];
			array[b-1] = array[c-1];
			array[c-1] = flag;
					
		}
		for(int j=0; j<3; j++) {
			if(array[j]==1) {
				System.out.println(j+1);
				break;
	}
	}
	}
}
