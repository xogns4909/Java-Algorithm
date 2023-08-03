import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int stu = sc.nextInt();
		int[][] class1 = new int [stu][5];
		int num=0;
		int grade =0;
		for(int i=0; i<stu; i++) {
			for(int j=0; j<5; j++) {
				class1[i][j] = sc.nextInt();
			}
		}
		 for (int i = 0; i < stu; i++) { // 학생
	            Set<Integer> set = new HashSet<>();
	            for (int j = 0; j < 5; j++) { // 학년
	                for (int k = 0; k < stu; k++) {
	                    if (i == k) continue;
	                    if (class1[i][j] == class1[k][j]) {
	                        set.add(k);
	                    }
	                }
	            }
	            if (num < set.size()) {
	                num = set.size();
	                grade = i + 1;
	            }
	        }
	        if(grade == 0) {
	            System.out.println(1);
	        } else {
	            System.out.println(grade);
	        }
	    }
	}