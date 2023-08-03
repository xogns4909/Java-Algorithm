import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer> lotto = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {	
		int n =sc.nextInt();
		if(n==0) break;
		int[] arr =new int[n];
		for(int i=0; i<n; i++) {
			arr[i] =sc.nextInt();
		}		
		bru(arr,0,0);
		System.out.println();
		}
	}
public static void bru(int[] a,int index, int cnt) {
		if(cnt == 6) {
			for(int i=0; i<6; i++) {
				System.out.print(lotto.get(i)+" ");
			}
			System.out.println();
			return;
		}
		if(index==a.length) return;
		lotto.add(a[index]);
		bru(a,index+1,cnt+1);
		lotto.remove(lotto.size()-1);
		bru(a,index+1,cnt);
		}
}
