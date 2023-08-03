import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double n = sc.nextInt();
        
        int k = 1;
      while(n>Math.pow(10,k)) {
            if(n > Math.pow(10, k)) {
                int pow = (int)Math.pow(10, k);
                n /= pow;
                n = Math.round(n);
                n *= pow;
            } else 
            	break;
            k++;
        }
        System.out.println((int)n);
        sc.close();
    }
}