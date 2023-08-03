import java.util.ArrayList;
import java.util.Scanner;

public class Main {
		static int n;
		static String[] ch = new String[10];
		static boolean[] check = new boolean[10];
		static int[] arr = new int[10];
		static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			ch[i] = sc.next();
			}
		br(0);
		int size = result.size()-1;
//		for(int i=0; i<result.size(); i++) {
//			for(int j=0; j<=n; j++) {
//				System.out.print(result.get(i).get(j));
//			}
//			System.out.println();
//		}
		for(int i=0; i<=n; i++) {
			System.out.print(result.get(size).get(i));
	}
		System.out.println();
		for(int i=0; i<=n; i++) {
			System.out.print(result.get(0).get(i));
		}
}		
public static boolean check() {
	for(int i=0; i<n; i++) {
		if(ch[i].charAt(0)=='<') {
			if(arr[i] > arr[i+1]) return false;
		}
		else if(ch[i].charAt(0)=='>') {
			if(arr[i] < arr[i+1]) return false;
		}
	}
	return true;
}
public static int br(int idx) {
	ArrayList<Integer> tmp = new ArrayList<Integer>();
	if(idx == n+1) {
		if(check()==true) {
			for(int j=0; j<n+1; j++) {
			tmp.add(arr[j]);
			}
			result.add(tmp);
		}
	}
		for(int i=0; i<10; i++) {
		if(check[i]==false) {
		arr[idx]=i;
		check[i]=true;
		br(idx+1);
		check[i]=false;
			}
		}
return 0;	
 }
}

