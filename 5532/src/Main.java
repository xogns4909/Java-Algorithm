import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array =new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<5; i++) {
			array[i] = sc.nextInt();
		
		}
		int a = 0;
		int b =0;
		if(array[1] % array[3] == 0) {
			a = array[1] / array[3];
			}
		else
			a = (array[1]/array[3])+1;
		if(array[2] % array[4] == 0) {
			b = array[2] / array[4];
			}
		else
			b = (array[2]/array[4])+1;
	if(a>b)
		System.out.print(array[0]-a);
	else
		System.out.print(array[0]-b);
	}

}
