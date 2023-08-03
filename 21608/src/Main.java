import java.util.Scanner;

public class Main {
	static int n,m;
	static int[] arr;
	static int[] robot;
	static int count;
	static int tmp=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[2*n];
		robot = new int[n]; 
		for(int i =0; i<2*n; i++) {
			arr[i] = sc.nextInt();
		}
		while(check()) {
			tmp++;
			change();
			doing();
			}
		System.out.print(tmp);	
		}
	
	public static void doing(){
		if(robot[n-1]==1) {
			robot[n-1]=0;
		}
		for(int i=n-1; i>0; i--) {
			if(robot[i-1] == 1 && robot[i]==0 && arr[i]>0) {
				robot[i] = 1;
				robot[i-1]=0;
				arr[i]--;
			}
		}
			if(robot[0] == 0 && arr[0]>0) {
				robot[0]=1;
				arr[0]--;
			}
		
		
	}
	
	public static void change(){
		int map = arr[arr.length-1];
		for(int i=arr.length-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] =map;
		for(int i=n-1; i>0; i--) {
			robot[i] = robot[i-1];
		}
		robot[0] = 0;
	}
	
	public static boolean check() {
		count = 0;
		for(int i=0; i<2*n; i++) {
			if(arr[i]==0) {
				count +=1;
			}
		}
		if(count >= m) {
			return false;
		}
		else {
			return true;
		}
	}
	

}
