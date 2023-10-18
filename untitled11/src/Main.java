import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
  static int n;
  static int k;
  static int[] gap;

  static int result = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> dis = new ArrayList<>();
    input(br, dis);
    gap = new int[n-1];
    Collections.sort(dis);
    getGap(dis);
    Arrays.sort(gap);
    solve();
    System.out.println(result);
  }

  private static void input(BufferedReader br, List<Integer> dis) throws IOException {
    n = Integer.parseInt(br.readLine());
    k = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    while(st.hasMoreTokens()){
      dis.add(Integer.parseInt(st.nextToken()));
    }
  }

  private static void solve() {
    for(int i = 0; i<n-k; i++){
      result += gap[i];
    }
  }

  private static void getGap(List<Integer> dis) {
    for(int i = 1; i<n; i++){
      gap[i-1] = dis.get(i) - dis.get(i-1);
    }
  }

}
