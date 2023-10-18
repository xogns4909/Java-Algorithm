import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  static class Index{
    int x;
    int y;
    public Index(int x, int y){
      this.x = x;
      this.y = y;
    }
  }
  static int[][] map;
  static boolean[][] visit;
  static int count;
  static int result = 0;

  static int r;

  static int c;

  static int[] dx = new int[]{1,-1,0,0};
  static int[] dy = new int[]{0,0,-1,1};
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
    r = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());
    map = new int[r][c];
    for (int i = 0; i < r; i++) {
      st = new StringTokenizer(bufferedReader.readLine());
      for (int j = 0; j < c; j++) {
        int value = Integer.parseInt(st.nextToken());
        map[i][j] = value;
        if(value == 1){
          count++;
        }
      }
    }
    int lastCount =0;
    while(count != 0){
      lastCount = count;
      visit = new boolean[r][c];
      result += 1;
      bfs();
    }

    System.out.println(result);
    System.out.println(lastCount);



  }

  private static void bfs() {
    Queue<Index> q = new LinkedList<Index>();
    q.add(new Index(0,0));
    while(!q.isEmpty()){
      Index poll = q.poll();
      for(int i = 0; i<4; i++){
        int nx = poll.x + dx[i];
        int ny = poll.y + dy[i];
        if(nx >= 0 && ny >= 0 && nx < r && ny < c && visit[nx][ny] == false){
          visit[nx][ny] = true;
          if(map[nx][ny] == 0){
            q.offer(new Index(nx,ny));
          }else if(map[nx][ny] == 1){
            map[nx][ny] = 0;
            count --;
          }
        }

      }
    }
  }
}
