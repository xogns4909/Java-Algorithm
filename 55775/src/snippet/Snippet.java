package snippet;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tmp=1;
		int size =n;
		while(tmp<n*2) {
			if(size > 0) {
				System.out.print('*');
				size--;
			}
			else if(size<0) {
				System.out.print('*');
					size++;
			}
			else if(size==0 ) {
				size = n-tmp;
				if(size<=0 ) {
					size-=2;
				}
				
				System.out.println();
				tmp+=1;
			}
		}
 }
}
