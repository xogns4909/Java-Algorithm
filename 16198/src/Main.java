import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.HashMap;

public class Main {
	static ArrayList<Integer> arr;
	static boolean visit[];
	static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		n =sc.nextInt();
		arr = new ArrayList<Integer>();
		visit = new boolean[n];
		for(int i=0; i<n; i++) {
			arr.add(sc.nextInt());
		}
		System.out.print(bur(arr));
	}
public static int bur(ArrayList<Integer> arr) {
	int a = arr.size();
	if(a == 2) return 0;
	int result =0;
	for(int i=1; i<a-1; i++) {
		int energy = arr.get(i-1)*arr.get(i+1);
		ArrayList<Integer> b = new ArrayList<>(arr);
		b.remove(i);
		energy+=bur(b);
		if(result < energy) {
			result = energy;
		}
	}

return result;
}
}
