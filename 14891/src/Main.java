import java.util.Scanner;

public class Main {
	static int top[][];
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		top = new int[4][8];
		for(int i=0; i<4; i++) {
			String s = sc.next();
			for(int j=0; j<8; j++) {
				top[i][j]=s.charAt(j)-'0';
			}
			}
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int t =sc.nextInt();
			int d = sc.nextInt(); 
			slove(t-1,d);
		}
		int sum=0;
		for(int i=0; i<4; i++) {
			if(top[i][0]!=0) {
				if(i==0) sum+=1;
				else if(i==1) sum+=2;
				else if(i==2) sum+=4;
				else if(i==3) sum+=8;
			}
		}
		System.out.print(sum);
	}
static void slove(int t,int d) {
	checkleft(t-1,-d);
	checkright(t+1,-d);
	rotate(t,d);
}
static void checkleft(int t,int d) {
	if(t < 0)
		return;
	if (top[t][2] != top[t + 1][6]) {
        checkleft(t-1,-d);
        rotate(t,d);
    }
}	

static void checkright(int t,int d) {
	if(t > 3) return;
	
	if(top[t][6] != top[t-1][2]) {
		checkright(t+1,-d);
		rotate(t,d);
	}
}
static void rotate(int idx, int dir) {
    if (dir == 1) {
        int temp = top[idx][7];

        for (int i = 7; i > 0; i--) {
            top[idx][i] = top[idx][i - 1];
        }

        top[idx][0] = temp;

    } else {
        int temp = top[idx][0];

        for (int i = 0; i < 7; i++) {
            top[idx][i] = top[idx][i + 1];
        }

        top[idx][7] = temp;
    }
}
}