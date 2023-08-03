import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		int a= sc.nextInt();
		int b =0;
		for(int i=1; i<=a; i++) {
			queue.add(i);
		}
		while(queue.size()!=1) {
			queue.remove();
			queue.add(queue.remove());			
		}
		System.out.print(queue.remove());
	}

}
