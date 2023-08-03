import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue a = new LinkedList();
		int N =sc.nextInt();
		int b= sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			a.add(i);
		}
		String d ="<";
		while(a.size() != 1) {
			for(int i=0; i<b-1; i++) {
				int c =(int) a.poll();
				a.offer(c);
			}
				d += a.poll()+","+" ";
					
				}
		System.out.print(d+a.poll()+'>');
			}
		
		}

