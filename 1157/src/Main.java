import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] arr = new int[26]; // �������� ������ 26����
		String s = in.next();
		 
		for (int i = 0; i < s.length(); i++){
		 
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // �빮�� ����
				arr[s.charAt(i) - 'A']++;	// �ش� �ε����� �� 1 ����
			}
		    
			else {	// �ҹ��� ����
				arr[s.charAt(i) - 'a']++;
			}
		}
		 
		 
		int max = -1;
		char ch = '?';
		 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65); // �빮�ڷ� ����ؾ��ϹǷ� 65�� �����ش�.
			}
			else if (arr[i] == max) {
				ch = '?';
			}
		}
		 System.out.print(ch);
	}

}
