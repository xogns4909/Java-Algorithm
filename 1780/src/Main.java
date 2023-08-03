import java.util.Scanner;

public class Main {
	public static int arr[][];
	public static int ze=0;;
	public static int pl=0;;
	public static int mi=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++ ) {
				arr[i][j]=sc.nextInt();
			}
			}
		check(0,0,n);
		System.out.println(mi);
		System.out.println(ze);
		System.out.println(pl);		
	}
public static void check(int row, int col, int size) {
	if(check_num(row,col,size)==true) {
		if(arr[row][col]==-1) {
			mi +=1;
		}
		else if(arr[row][col]==0) {
			ze+=1;
		}
		else {
			pl+=1;
		}
		return;
	}
	int newsize = size /3;
	check(row,col,newsize);
	check(row,col+newsize,newsize);
	check(row,col+newsize+newsize,newsize);
	check(row+newsize,col,newsize);
	check(row+newsize,col+newsize,newsize);
	check(row+newsize,col+newsize+newsize,newsize);
	check(row+newsize+newsize,col,newsize);
	check(row+newsize+newsize,col+newsize,newsize);
	check(row+newsize+newsize,col+newsize+newsize,newsize);
	
}
public static boolean check_num(int row,int col,int size) {
	int num = arr[row][col];
	for(int i=row; i<row+size; i++) {
		for(int j=col; j<col+size; j++) {
			if(num!=arr[i][j]) {
				return false;
			}
		}
	}
	return true;
}
}
