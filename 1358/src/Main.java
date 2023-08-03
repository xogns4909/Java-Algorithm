import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		String reverse1 ="";
		String reverse2= "";
		for(int i= num1.length()-1; i>=0; i--) {
			reverse1 = reverse1 + num1.charAt(i);
		}
		for(int j= num2.length()-1; j>=0; j--) {
			reverse2 = reverse2 + num2.charAt(j);
	}
		int a =Integer.parseInt(reverse1)+Integer.parseInt(reverse2);
		String b =Integer.toString(a);
		String result ="";
		for(int k= b.length()-1; k>=0; k--) {
			result = result + b.charAt(k);
	}

	System.out.print(Integer.parseInt(result));
}
}