import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		int count =0;
		ArrayList<Integer> A_arr = new ArrayList<Integer>();
		ArrayList<Integer> B_arr = new ArrayList<Integer>();
		int num_1 =sc.nextInt();
		int[] a= new int[num_1];
		for(int i=0; i<num_1; i++) {
			a[i]=sc.nextInt();
		}
		int num_2 =sc.nextInt();
		int[] b= new int[num_2];
		for(int i=0; i<num_2; i++) {
			b[i]=sc.nextInt();
		}
		for(int i=0; i<num_1; i++) {
			int sum=0;
			for(int j=i; j<num_1; j++) {
				sum+=a[j];
				A_arr.add(sum);
			}
		}
		for(int i=0; i<num_2; i++) {
			int sum=0;
			for(int j=i; j<num_2; j++) {
				sum+=b[j];
				B_arr.add(sum);
			}
		}
		Collections.sort(A_arr);
		Collections.sort(B_arr);
		HashMap<Integer,Integer> hashmap = new HashMap<>();
			for(int  i :A_arr){
//				System.out.print(i+" ");
				if(hashmap.containsKey(i)) {
					int temp = hashmap.get(i);
					hashmap.put(i, temp+1);
				}
				else {
					hashmap.put(i, 1);
				}	
				}
//			System.out.println();	
			for(int i :B_arr) {
//				System.out.print(i+" ");
//				System.out.println();
				if(hashmap.containsKey(t-i)) {
//					System.out.print(i+" ");
					count+=hashmap.get(t-i);
				}
			}
		System.out.print(count);
	}

}