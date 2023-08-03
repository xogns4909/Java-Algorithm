import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt(), m = sc.nextInt();
		int a[][] = new int[n][m];
		for(int i = 0; i < n; i++ )
			for(int j = 0; j < m; j++ )
				a[i][j] = sc.nextInt();
                
		m = sc.nextInt(); 
		int k = sc.nextInt();
		int b[][] = new int[m][k];
		for(int i = 0; i < m; i++ )
			for(int j = 0; j < k; j++ )
				b[i][j] = sc.nextInt();
                
                
		int r[][] = new int[n][k];
		for(int i = 0; i < n; i++ ) 
			for(int j = 0; j < k; j++ ) 
				for(int l = 0; l < m; l++ )
					r[i][j] += a[i][l] * b[l][j];

		for(int i = 0; i < n; i++ ) {
			for(int j = 0; j < k; j++ )
				System.out.print( r[i][j] + " " );
			System.out.println();
		}
	}
}