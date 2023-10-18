import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

  static int n;
  static long total;
  static long[] rightTotal;
  static long[] leftTotal;
  static  List<Integer> bees = new ArrayList<>();
  static long result = 0l;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    rightTotal = new long[n];
    leftTotal = new long[n];
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    int temp = 0;
    for(int i = 0; i < n; i++){
      bees.add(Integer.parseInt(st.nextToken()));
      temp += bees.get(i);
      rightTotal[i] = temp;
    }

    total = rightTotal[n-1];

    temp = 0;
    setLeftTotal(bees, temp);
    case0();
    case1();
    case2();

    System.out.println(result);
  }

  private static void case2() {
    for(int i = 1; i<= n-2; i++){
      long bee1 = rightTotal[i] - bees.get(0);
      long bee2 = leftTotal[i] - bees.get(n-1);
      result = Math.max(result,bee1+bee2);
    }
  }

  private static void case1() {
    for(int i = n-2; i>=0; i--){
      long bee1 = total - leftTotal[n-1] - bees.get(i);
      long bee2 = total - leftTotal[i];
      result = Math.max(result,bee1+bee2);
    }
  }

  private static void case0() {
    for(int i = 1; i<n; i++){
      long bee1 = total - rightTotal[0] - bees.get(i);
      long bee2 = total - rightTotal[i];
      result = Math.max(result,bee1 + bee2);
    }
  }

  private static void setLeftTotal(List<Integer> bees, int temp) {
    for(int i = n-1; i >=0; i--){
      temp += bees.get(i);
      leftTotal[i] = temp;
    }
  }

}
