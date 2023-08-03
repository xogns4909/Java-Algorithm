import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int[] count = new int[26];
		while(sc.hasNextLine()) {
		String egl = sc.nextLine();
		for(int i = 0; i<egl.length(); i++) {
			if(egl.charAt(i) != ' ') {
				count[egl.charAt(i)-97]++;
				}
			}
		}
		for(int j =0; j<26; j++) {
			if(max < count[j])
				max = count[j];
	}
		for(int k=0; k<26; k++){
			if(max == count[k])
				System.out.print((char)(k+97));
			
		}
	}

}
