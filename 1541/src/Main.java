import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        String str = sc.nextLine();
		        String[] Arr = str.split("\\-");
		        int result = 0;
		        for (int i = 0; i < Arr.length; i++) {
		        	System.out.println(Arr[i]);
		        	String[] plusArr = Arr[i].split("\\+");
		            for (int j = 0; j < plusArr.length; j++) {
		                if (i == 0) {
		                    result += Integer.parseInt(plusArr[j]);
		                } else {
		                    result -= Integer.parseInt(plusArr[j]);
		                }
		            }
		        }
		        System.out.println(result);
		    }
		}
	
