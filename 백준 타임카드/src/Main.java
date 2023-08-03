import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a =new int [6];
//		int[] b=new int [3];
//		Scanner sc = new Scanner(System.in);
//		for(int j=0; j<3; j++) {
//		for(int i=0; i<6; i++) 
//			a[i] = sc.nextInt();
//			b[j] = (a[3]*3600 +a[4]*60+a[5]) -(a[0]*3600 +a[1]*60+a[2]);
//		}
//			for(int k=0; k<3; k++) {
//			System.out.print(b[k]/3600+" ");
//			System.out.print(b[k]%3600/60+" ");
//			System.out.print(b[k]%3600%60+" ");
//			System.out.println	();
//			}
		ArrayList<String> size= new ArrayList<String>(); 
		for(int i=7; i<81; i++)
			if(i>=7 && i<=10) {
				size.add(Integer.toString(i+1));
			}
			else if(i>10 && i<81) {
				size.add(Integer.toString(i+2));
			}
		for(int i=0; i<size.size(); i++) {
			System.out.println(size.get(i));
		}
}
}