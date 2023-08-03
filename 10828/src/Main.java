import java.util.Scanner;

public class Main {
	public static int n;
	public static int[] arr;
	public static int size =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb= new StringBuilder(); 
		n =sc.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++) {
			String a = sc.next();		
			if(a.equals("push")) {
				push(sc.nextInt());
			}
			if(a.equals("pop")) {
				sb.append(pop()).append('\n');
			}
			if(a.equals("top")) {
				sb.append(Top()).append('\n');
			}
			if(a.equals("size")) {
				sb.append(size()).append('\n');
			}
		if(a.equals("empty")) {
			sb.append(empty()).append('\n');
	}
		}
		System.out.print(sb);
	}
public static void push(int a) {
	arr[size] = a;
	size+=1;
}
public static int pop() {
	if(size == 0) {
		return -1;
	}
	else {
		int b = arr[size - 1];
		arr[size - 1] = 0;
		size--;
		return b;
	}
}
public static int Top() {
	if(size ==0) {
		return -1;
}
	else {
		return arr[size-1];
	}

}
public static int size() {
	return size;
}
public static int empty() {
	if(size==0) {
		return 1;
	}
	else {
		return 0;
	}
	}
}


