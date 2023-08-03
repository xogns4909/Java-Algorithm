import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String s = in.next();
        int arr[] = new int[26];
        for(int j =0; j<26; j++) {
        	arr[j] = -1;
        }
        for(int i = 0; i<s.length();i++){
        	if(arr[s.charAt(i)- 97] == -1)
        	arr[s.charAt(i)- 97] = i;
           
        }
        
        for(int i =0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
        

    }
}