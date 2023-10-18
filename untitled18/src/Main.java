import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

  static boolean[] stop = new boolean[10];

  static String size;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    size = br.readLine();
    int n = Integer.parseInt(size);
    int m = Integer.parseInt(br.readLine());
    if(m > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < m; i++) {
      int index = Integer.parseInt(st.nextToken());
      stop[index] = true;
    }
    }
    int result = Math.abs(100 - n);
    for (int i = 0; i <= 999999; i++) {
      String value = Integer.toString(i);
      boolean canGo = false;
      for(int j = 0; j < value.length(); j++){
        if(stop[ value.charAt(j)- '0']) {
          canGo = true;
          break;
        }
      }
      if(canGo == false) {
        int operand = value.length() + Math.abs(i - n);
        result = Math.min(operand, result);
      }
      }
    System.out.println(result);
  }
    
}
