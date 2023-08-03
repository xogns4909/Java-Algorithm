import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		String[] str =new String[n];
		String a ="";
		for(int i=0; i<n; i++) {
			str[i] = sc.next();
		}
	Arrays.sort(str);
	Arrays.sort(str, Comparator.comparing(String::length));
	for(int i =0; i<n; i++) {
		if(a.equals(str[i])) {
			continue;
		}
		else {
		System.out.println(str[i]);
		a=str[i];
	}
	}

}
}
