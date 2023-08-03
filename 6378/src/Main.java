//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i=0; i<n; i++) {
//			int o = 1;
//			int result =0;
//			String a =sc.next();
//			for(int j=0; j<a.length(); j++) {
//				if(a.charAt(j)=='O') {
//					result += o;
//					o+=1;
//					}
//				else {
//					o = 1;
//				}
//			}
//			System.out.println(result);
//		}
//	}
//
//}
 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			A[i] = Integer.parseInt(st.nextToken());
			B[i] = Integer.parseInt(st.nextToken());
		}
		//����
		Arrays.sort(A);
		Arrays.sort(B);
		
		//�����߱⶧���� ���� ���� ���� ū���� ���� ���� ���� �ȴ�.
		System.out.println((A[N - 1] - A[0]) * (B[N - 1] - B[0]));
	}

}