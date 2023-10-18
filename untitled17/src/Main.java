import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  static class Point{
    int x;
    int y;
    int count;
    public Point(int x, int y, int count){
      this.x = x;
      this.y = y;
      this.count = count;
    }
  }

  static int[] dx = {0,0,-1,1};

  static int[] dy = {1,-1,0,0};
  static int n,m,c,r,startX,startY,endX,endY;
  static boolean visit[][];
  static int map[][];
  static int result = -1;

  public static void main(String[] args) throws IOException {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bufferedReader.readLine()," ");
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    map = new int[1001][1001];
    visit = new boolean[1001][1001];
    for(int i = 1; i<=n; i++){
      st = new StringTokenizer(bufferedReader.readLine(), " ");
      for(int j = 1; j<=m; j++){
        map[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    st = new StringTokenizer(bufferedReader.readLine()," ");
    r = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());
    startX = Integer.parseInt(st.nextToken());
    startY = Integer.parseInt(st.nextToken());
    endX = Integer.parseInt(st.nextToken());
    endY = Integer.parseInt(st.nextToken());

    bfs();
    System.out.println(result);
  }

  private static void bfs() {
    Queue<Point> q = new ArrayDeque<>();
    q.add(new Point(startX,startY,0));
    visit[startY][startY] = true;
    while (!q.isEmpty()){
      Point p = q.poll();
      if(p.x == endX && p.y == endY ){
        result = p.count;
        return;
      }
      for(int i =0; i<4; i++){
        int nx = p.x + dx[i];
        int ny = p.y + dy[i];
        if (nx < 1 || ny < 1 || nx > n || ny > m || visit[nx][ny])
          continue;
        if(!canGo(nx, ny))
          continue;
        visit[nx][ny] = true;
        q.add(new Point(nx, ny, p.count + 1));
      }
    }
  }

  private static boolean canGo(int nx, int ny) {
    for (int j = nx; j < nx + r; j++) {
      for (int k = ny; k < ny + c; k++) {
          if(j > n || k > m  || map[j][k] == 1)
            return  false;
      }
    }
    return  true;
  }
}
