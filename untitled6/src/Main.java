import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
  static int total;
  static int size;
  static int[] values;
  static int[] arr;
  static boolean[] visit;

  static Set<List<Integer>> list = new LinkedHashSet<>();
  static int index = 0;

  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bufferedReader.readLine()," ");
    total = Integer.parseInt(st.nextToken());
    size = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(bufferedReader.readLine()," ");
    values = new int[total];
    arr = new int[size];
    visit = new boolean[total];
    int i =0;
    while(st.hasMoreTokens()){
      values[i] = Integer.parseInt(st.nextToken());
      i++;
    }
    Arrays.sort(values);
    dfs(0);

    List<List<Integer>> targetList = new ArrayList<>(list);
    for(List<Integer> l : list){
      for(int j : l) {
        sb.append(j).append(" ");
      }
      sb.append("\n");
    }
    System.out.print(sb);
  }

  private static void dfs(int depth) {
    if(size == depth){
      List<Integer> l = new ArrayList<>();
      for(int i =0; i<size; i++){
        l.add(arr[i]);
//        sb.append(arr[i]);
//        if(i == size -1){
//          sb.append("\n");
//        }
//        else{
//          sb.append(" ");
//        }
      }
//      System.out.println(l);
      list.add(l);
      return;
    }
    for(int i = 0; i<total; i++) {
        if(!visit[i]) {
          visit[i] = true;
          arr[depth] = values[i];
          dfs(depth + 1);
          visit[i] = false;
          }
      }
    }
  }

