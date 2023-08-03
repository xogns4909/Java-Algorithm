import java.util.Scanner;

public class Main {
	public static int[][] arr;
	public static int n;
	public static int blue =0;
	public static int white =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		check(0,0,n);
		System.out.println(white);
		System.out.println(blue);
	}
	public static void check(int row, int col, int size) {
		if(color(row,col,size)==true) {
			if(arr[row][col]==0) {
				white+=1;
			}
			else {
				blue+=1;
		}
			return;
		}
		int newsize =size/2;
		check(row,col,newsize);
		check(row,col+newsize,newsize);
		check(row+newsize,col,newsize);
		check(row+newsize,col+newsize,newsize);
		
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
