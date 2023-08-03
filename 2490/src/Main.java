import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array =new int[4];
		String b = " ";
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			int result =0;
			for(int j=0; j<4; j++) {
				array[j] = sc.nextInt();
				if (array[j] == 0)
					result+=1;
			}
		if(result==1)
			System.out.println('A');
		else if(result==2)
			System.out.println('B');
		else if(result==3)
			System.out.println('C');
		else if(result==4)
			System.out.println('D');
		else
			System.out.println('E');
	}
	}
}
