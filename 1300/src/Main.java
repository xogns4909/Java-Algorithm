import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		HashSet b = new HashSet();
		for(int i=0; i<10; i++) {
			b.add(sc.nextInt()%42);
		}
		System.out.print(b.size());
	}

}
