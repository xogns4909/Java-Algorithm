import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  static int[] values;

  static List<Integer> result  = new ArrayList<>();
  static  boolean[] visit;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    values = new int[n + 1];
    visit = new boolean[n +1 ];
    for(int i =1 ; i<=n; i++){
      values[i] = Integer.parseInt(br.readLine());
    }
    for(int i =1; i<=n; i++){
      visit[i] = true;
      dfs(values[i],i);
      visit[i] = false;
    }
    Collections.sort(result);
    System.out.println(result.size());
    for(int i : result){
      System.out.println(i);
    }
  }

  private static void dfs(int value, int i) {
    if(!visit[value]){
      visit[value] = true;
      dfs(values[value],i);
      visit[value] = false;
    }

    if(values[value] == i){
      result.add(i);
    }
  }


}
