import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

  static class Point {

    int x;
    int y;
    int count;

    public Point(int x, int y, int count) {
      this.x = x;
      this.y = y;
      this.count = count;
    }
  }

  static boolean[][] visit;

  static int[] dx = {0, 0, 1, -1};
  static int[] dy = {1, -1, 0, 0};
  static int n;
  static int m;
  static int maximum;

  static int result = Integer.MAX_VALUE;

  static boolean hasSword = false;

  static int map[][];

  public static void main(String args[]) throws IOException {
    input();
    bfs();
    if (result == Integer.MAX_VALUE) {
      System.out.println("Fail");
    } else {
      System.out.println(result);
    }
  }

  private static void bfs() {
    Queue<Point> q = new ArrayDeque<>();
    q.add(new Point(0, 0, 0));
    visit[0][0] = true;

    while (!q.isEmpty()) {
      Point p = q.poll();
      if(p.count > maximum){
        break;
      }

      if (p.x == n - 1 && p.y == m - 1) {
        result = Math.min(result, p.count);
        break;
      }

      if (map[p.x][p.y] == 2) {
        int countWithSword =  p.count + (m - 1 - p.y) + (n - 1 - p.x);
        if(countWithSword <= maximum) {
          result = countWithSword;
        }
        continue;
      }

      for (int i = 0; i < 4; i++) {
        int nx = p.x + dx[i];
        int ny = p.y + dy[i];

        if (nx >= 0 && ny >= 0 && nx < n && ny < m && map[nx][ny] != 1
            && !visit[nx][ny]) {
          visit[nx][ny] = true;
          q.add(new Point(nx, ny, p.count + 1));
        }
      }
    }
  }

  private static void input() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());
    maximum = Integer.parseInt(st.nextToken());
    map = new int[n][m];
    visit = new boolean[n][m];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      for (int j = 0; j < m; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());
      }
    }
  }
}

