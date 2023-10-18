import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  public static class Su{
    int dis;
    int count;
    public Su(int dis,int count){
      this.dis = dis;
      this.count = count;
    }
  }

  static int result = Integer.MAX_VALUE;

  static int visit[] = new int[100001];
  static int nx;

  static int resultCount;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    int su = Integer.parseInt(st.nextToken());
    int bro = Integer.parseInt(st.nextToken());
    if( su >= bro){
      System.out.println(su-bro);
      System.out.println(1);
      return;
    }
    bfs(su,bro);
    System.out.println(result);
    System.out.println(resultCount);
  }

  private static void bfs(int su, int bro){
    Queue<Su> q = new ArrayDeque<>();
    q.add(new Su(su,0));
    while (!q.isEmpty()) {
      Su p = q.poll();

      if(result < visit[p.dis]) {
        return;
      }

      for (int i = 0; i < 3; i++) {
        switch (i) {
          case 0:
            nx = p.dis + 1;
            break;
          case 1:
            nx = p.dis - 1;
            break;
          case 2:
            nx = p.dis * 2;
            break;
        }
        if (nx == bro) {
          if(result == Integer.MAX_VALUE) {
            result = visit[p.dis] + 1;
          }
          resultCount += 1;
        }
        if (nx > 0 && nx < 100000) {
          if (visit[nx] == 0 || visit[nx] == visit[p.dis] +1 ) {
            q.add(new Su(nx, visit[p.dis]+1));
            visit[nx] = visit[p.dis] +1;
          }
        }
      }
    }
  }
}
