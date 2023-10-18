import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

  static int result = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " ");
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    List<Integer> numbers = new ArrayList<>();
    int[] gap = new int[n - 1];
    st = new StringTokenizer(bufferedReader.readLine(), " ");
    for (int i = 0; i < n; i++) {
      numbers.add(Integer.parseInt(st.nextToken()));
    }
    Collections.sort(numbers);

    getGap(n, numbers, gap);
    Arrays.sort(gap);
    solve(n, k, gap);
    System.out.println(result);
  }

  private static void solve(int n, int k, int[] gap) {
    for (int i = 0; i < n - k; i++) {
      result += gap[i];
    }
  }

  private static void getGap(int n, List<Integer> numbers, int[] gap) {
    for (int i = 1; i < n; i++) {
      gap[i - 1] = numbers.get(i) - numbers.get(i - 1);
    }
  }

}
