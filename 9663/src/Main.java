import java.util.Scanner;

public class Main {
	public static int m;
	public static int[]arrx;
	public static int count=0;	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		m =sc.nextInt();
		arrx=new int[m];
		dfs(0);
		System.out.print(count);
		
				}
public static boolean answer(int col) {
	for(int i=0; i<col; i++) {
		if(arrx[col]==arrx[i]) return false;
		if(Math.abs(col-i)==Math.abs(arrx[col]-arrx[i])) return false;
	}
	return true;
}
public static void dfs(int y) {
	if(y==m) {
		count++;
		return;
	}

		for(int i=0; i<m; i++) {
			arrx[y] =i;
			if(answer(y)) {
                dfs(y+1);
		}
	}
}
}


