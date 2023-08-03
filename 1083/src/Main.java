import java.util.*;
public class Main {

	 static int cnt;
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int size = scanner.nextInt();
	        ArrayList<Integer> arr=  new ArrayList<Integer>();
	        ArrayList<Integer> sort = new ArrayList<Integer>();
	        for(int i =0; i<size; i++) {
	        	arr.add(scanner.nextInt());
	        	sort.add(arr.get(i));
	        }
	        cnt = scanner.nextInt();
	        
	        Collections.sort(sort, Collections.reverseOrder());
	        for(int i=0; i<size; i++) {
	        	if(cnt > 0) {
	        	for(int j = 0; j<size; j++) {
	        		int max = arr.indexOf(sort.get(j));
	        		if(cnt - (max - i) < 0 && max - i > 0 && max < i) {
	        			continue;
	        		}
	        		
	        		else if(cnt -(max-i) >= 0 && max >= i){
	        			cnt -= (max - i);
	        			sw(arr,max,i);
//	        			System.out.println(max+" "+ i+" "+ arr.get(max)+" "+cnt);
//	        			System.out.println(arr);
	        			break;
	        		}
	        	}
	        	}
	        }
	        for(int i =0; i<size; i++) {
	        	System.out.print(arr.get(i)+" ");
	        }
	    
	    }
	    public static void sw(ArrayList<Integer> arr,int max, int change) {
//	    	System.out.println(arr.get(change)+" "+arr.get(max));
	    	if(arr.get(change) < arr.get(max) ) {
	    	int temp = arr.get(max);
	    	arr.remove(max);
	    	arr.add(change,temp);
	    	}
	    }
}
