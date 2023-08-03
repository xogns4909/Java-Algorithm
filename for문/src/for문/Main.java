package for¹®;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even =0;
		int odd = 0;
		for(int i =0; i <= 100; i++)
			if(i%2 == 0) {
				even += 1;
				
			}
			else
				odd+=1;
		System.out.println("Â¦¼öÀÇ °¹¼ö´Â"+even+"ÀÔ´Ï´Ù");		
		System.out.println("È¦¼öÀÇ °¹¼ö´Â"+odd+"ÀÔ´Ï´Ù");
	}

}
