import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> crain = new ArrayList<>();
		for(int i=0; i<n; i++) {
			crain.add(sc.nextInt());
		}
		int m = sc.nextInt();
		ArrayList<Integer> box = new ArrayList<>();
		for(int i =0; i<m; i++) {
			box.add(sc.nextInt());	
		}
		Collections.sort(crain,Collections.reverseOrder());
		Collections.sort(box,Collections.reverseOrder());
		if(crain.get(0) < box.get(0) ) {
			System.out.print(-1);
		}
		else{
			int time =0;
            while(box.size() != 0){
                int a = 0;
                int b = 0;
                while(a < n){
                    if(a == box.size())
                        break;
                    if(box.get(b) <= crain.get(a)){
                        box.remove(b);
                        a++;
                    }
                    else if(box.get(b) > crain.get(a)){
                       b++;
                    }
                }
                time++;
            }
            System.out.println(time);
            
        }	
		
	}

}
