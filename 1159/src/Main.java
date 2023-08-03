import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		char c ='a';
		int start = 0;
		int[] count= new int[26];
		for(int i=0; i<a; i++) {
			String b = sc.next();
			c = b.charAt(0);
			count[(c)-97] += 1;
		
		}
		for(int j=0; j< count.length; j++) {
			if(count[j]>=5) {
				System.out.print((char)(j+97));
				start+=1;
			}	
		}
		if(start == 0)
			System.out.print("PREDAJA");
	}
}

