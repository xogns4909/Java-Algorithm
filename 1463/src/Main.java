//import java.util.Scanner;
//
//public class Main {
//	public static int n;
//	public static Integer[] arr;
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		arr = new Integer[n+1];
//		arr[0] =0;
//		arr[1] =0;
//		System.out.print(dp(n));
//	}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
public	static Integer[] arr;
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		arr = new Integer[N + 1];
		arr[0] = arr[1] = 0;
		  for (int i = 2; i <= N; i++){
	           arr[i] = arr[i-1] + 1;
	           if (i % 2 == 0) arr[i] = Math.min(arr[i], arr[i/2] + 1);
	           if (i % 3 == 0) arr[i] = Math.min(arr[i], arr[i/3] + 1);
	       }
		System.out.print(arr[N]);
 
	}	
//public static int dp(int a) {
//	if(arr[a] == null) {
//		if(a%6 ==0) {
//			arr[a] = Math.min(dp(a-1), Math.min(dp(a/2), dp(a/3)))+1;
//		}
//		else if(a %3==0) {
//			arr[a] = Math.min(dp(a-1), dp(a/3))+1;
//		}
//		else if(a%2==0) {
//			arr[a] = Math.min(dp(a-1), dp(a/2))+1;
//		}
//		else {
//			arr[a] = dp(a-1)+1;
//		}
//		
//		}
//	return arr[a];
//}

}
