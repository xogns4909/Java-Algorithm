import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String[][] b=new String[a][a];
		int seat =0;
		String[] s = new String[a];
		int cnt =0;
		int seat1 =0;
		int cnt1 =0;
		for(int i=0; i<a; i++) {
			s[i] = sc.next();
			for(int j=0; j<a; j++) {
				b[i][j] = String.valueOf(s[i].charAt(j));
			}
		}
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				if(b[i][j].equals(".")) {
					cnt++;
					if(j==a-1) {
						if(cnt>=2) {
							seat++;
						}
						cnt=0;
					}
				}else if(b[i][j].equals("X")) {
					if(cnt>=2) {
						seat++;
					}
					cnt=0;
				}
			}
		}
		for(int i=0; i<a; i++) {
			for(int j=0; j<a; j++) {
				if(b[j][i].equals(".")) {
					cnt1++;
					if(j==a-1) {
						if(cnt1>=2) {
							seat1++;
						}
						cnt1=0;
					}
				}else if(b[j][i].equals("X")) {
					if(cnt1>=2) {
						seat1++;
					}
					cnt1=0;
				}
			}
		}
	
		System.out.print(seat+" "+seat1);
		
		sc.close();
	}
}