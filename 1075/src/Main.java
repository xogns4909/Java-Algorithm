import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String a = sc.nextLine();
		String c = null;
		String d = null;
		int b = sc.nextInt();
		//if( Integer.parseInt(a)%b == 0) {
		//	System.out.print(a.substring(a.length()-2,a.length()));
		//	}
		//else {
			c = Integer.toString(Integer.parseInt(a)+(b-Integer.parseInt(a)%b));
			d = Integer.toString(Integer.parseInt(a)-(b+Integer.parseInt(a)%b));
			c = c.substring(c.length()-2,c.length());
			d = d.substring(d.length()-2,d.length());
			if(Integer.parseInt(c)<=Integer.parseInt(d)){
				System.out.print(c);
			}
			else
				System.out.print(d);
			
			System.out.println(c);
			System.out.println(d);
			}
}

//}