import java.util.Scanner;

public class Main {
	public static int[][] arr;
	public static int n;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n][n];
		for(int i=0; i<n; i++) {
			String str = sc.next();
			for(int j=0; j<n; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		check(0,0,n);
		System.out.println(sb);
	}
	public static void check(int row, int col, int size) {
		if(color(row,col,size)==true) {
			sb.append(arr[row][col]);
			return;
		}
		int newsize =size/2;
		sb.append('(');
		check(row,col,newsize);
		check(row,col+newsize,newsize);
		check(row+newsize,col,newsize);
		check(row+newsize,col+newsize,newsize);
		sb.append(')');
	}
	public static boolean color(int row, int col, int size) {
		int co = arr[row][col];
		for(int i=row; i<row+size; i++) {
			for(int j=col; j<col+size; j++) {
				if(co != arr[i][j])
					return false;
			}
		}

	return true;
	}
	}
