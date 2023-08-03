import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int size = sc.nextInt();
		int count = sc.nextInt();
		String[] t = new String[41];
		int[] array = new int[size];
		String b;
		String s = sc.next();
        t = s.split(",");
		int a = size;
		for(int i=0; i<size; i++) {
			array[i] = Integer.parseInt(t[i]);
		}
			
		while(count!=0) {
			for(int j=0; j<a-1; j++) {
				array[j] = array[j+1]-array[j];
				if( j==array.length-2) {
					array = Arrays.copyOf(array,array.length-1);
					count--;
					a--;
				}	
			}
			}
		for(int i=0; i<array.length; i++) {
		System.out.print(array[i]);
		if(i!=array.length-1)System.out.print(",");
	}
	}
}
