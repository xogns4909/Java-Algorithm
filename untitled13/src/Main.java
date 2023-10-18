import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

  static class Village{
    long index;
    long count;
    public Village(long index,long count){
      this.index = index;
      this.count = count;
    }
  }

  static int n;

  static List<Village> villages = new ArrayList<>();

  static long total;


  static long result;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    for(int i =0; i<n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine()," ");
      long index = Long.parseLong(st.nextToken());
      long count = Long.parseLong(st.nextToken());
      total += count;
      villages.add(new Village(index,count));
    }
    sortByIndex();
    solve();
    System.out.println(result);
  }

  private static void solve() {
    long right = 0l;
    for(int i = 0; i<n; i++){
      right += villages.get(i).count;
      if(right >= (total+1)/2){
        result = villages.get(i).index;
        break;
      }
    }
  }



  private static void sortByIndex() {
    Collections.sort(villages, new Comparator<Village>() {
      @Override
      public int compare(Village o1, Village o2) {
        return (int) (o1.index - o2.index);
      }
    });
  }

}
