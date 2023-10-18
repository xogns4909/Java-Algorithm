import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  static int[] dx = {0,0,-1};
  static int[] dy;

  static class Point{
    int x;
    int y;
    int last;
     Point(int x, int y, int last){
      this.x = x;
      this.y = y;
      this.last = last;
    }
  }
  static int[][] map;
  static boolean[][] visit;
  static int n,k;

  static int result = 0 ;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    n = Integer.parseInt(st.nextToken());
    k = Integer.parseInt(st.nextToken());
    dy = new int[]{1,-1,k};
    map = new int[2][n + 1];
    visit = new boolean[2][n + 1];
    for(int i = 0 ; i<2; i++){
      String string = br.readLine();
      int[] values = string.chars()
          .map(value -> value - '0')
          .toArray();
      map[i] = values;
    }
    bfs();
    System.out.println(result);
  }

  private static void bfs() {
    Queue<Point> q = new ArrayDeque<>();
    q.add(new Point(0,0,-1));
    visit[0][0] = true;
    while(!q.isEmpty()){
      Point p = q.poll();

      for(int i = 0 ; i<3; i++){
        int nx = p.x + dx[i];
        int ny = p.y + dy[i];
        if(i == 2){
          nx = Math.abs(p.x + dx[i]);
        }
        if(ny >= n){
          result =1;
          return;
        }
        if(nx >= 0 && nx < 2 && ny >= 0 && ny < n && !visit[nx][ny] && map[nx][ny] == 1 && ny > p.last+1){
          visit[nx][ny] = true;
          q.add(new Point(nx,ny,p.last+1));
        }
      }
    }
  }
}
