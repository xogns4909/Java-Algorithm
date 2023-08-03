import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		
		Arrays.sort(arr);	// �̺� Ž���� �ϱ� ���ؼ��� �ݵ�� ���ĵǾ��־�� �Ѵ�.
		
		int M = in.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			int key = in.nextInt();
 
			// upperBound�� lowerBound�� ���� ���� ���Ѵ�.
			sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
		}
		System.out.println(sb);
	}
 
 
	private static int lowerBound(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 
 
		// lo�� hi�� ������ �� ���� �ݺ�
		while (lo < hi) {
 
			int mid = (lo + hi) / 2; // �߰���ġ�� ���Ѵ�.
 
			/*
			 *  key ���� �߰� ��ġ�� ������ �۰ų� ���� ���
			 *  
			 *  (�ߺ� ���ҿ� ���� �������� Ž���ϵ��� ��踦 ������.)
			 */
			if (key <= arr[mid]) {
				hi = mid;
			}
 
			else {
				lo = mid + 1;
			}
 
		}
 
		return lo;
	}
 
	private static int upperBound(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 
 
		// lo�� hi�� ������ �� ���� �ݺ�
		while (lo < hi) {
 
			int mid = (lo + hi) / 2; // �߰���ġ�� ���Ѵ�.
 
			// key���� �߰� ��ġ�� ������ ���� ���
			if (key < arr[mid]) {
				hi = mid;
			}
			// �ߺ������� ��� else���� ó���ȴ�.
			else {
				lo = mid + 1;
			}
 
		}
 
		return lo;
	}
	
}