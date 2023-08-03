import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static int[][] arr;
	public static int cnt =2;
	public static int n;
	public static int[] result = new int[25*25];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		arr = new int[n][n];
		for(int i=0; i<n; i++){
            String input = sc.next();
            for(int j=0; j<n; j++){
                arr[i][j] = input.charAt(j)-'0';
			}
		}
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(arr[i][j]==1) {
						dfs(i,j,cnt);
						cnt+=1;
					}
				}
			}
		System.out.println(cnt-2);
		Arrays.sort(result);
		for(int i=result.length-(cnt-2); i<result.length; i++) {
		System.out.println(result[i]);
		}
	}
public static void dfs(int a,int b,int cnt) {
	if(arr[a][b]!=cnt) {
		arr[a][b] =cnt;
		result[cnt] +=1;
	}
	if(a!=0 && arr[a-1][b]==1) {
		arr[a-1][b] = cnt;
		result[cnt]+=1;
		dfs(a-1,b,cnt);
	}
	if(a!= n-1 && arr[a+1][b] ==1) {
		arr[a+1][b] = cnt;
		result[cnt]+=1;
		dfs(a+1,b,cnt);
		
	}
	if(b>0 && arr[a][b-1]==1) {
		arr[a][b-1] = cnt;
		result[cnt]+=1;
		dfs(a,b-1,cnt);
		}
	if(b!=n-1 && arr[a][b+1]==1) {
		arr[a][b+1] = cnt;
		result[cnt]+=1;
		dfs(a,b+1,cnt);
	}
}
}
