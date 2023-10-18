import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

  static class lecture {

    int x;
    int y;

    public lecture(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine());
    List<lecture> lectures = new ArrayList<>();
    PriorityQueue<Integer> q = new PriorityQueue();
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " ");
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      lecture lecture = new lecture(x, y);
      lectures.add(lecture);
    }
    Collections.sort(lectures, new Comparator<lecture>() {
      @Override
      public int compare(lecture o1, lecture o2) {
        return o1.x - o2.x;
      }
    });
    q.add(lectures.get(0).y);
    for (int i = 1; i < n; i++) {
      if (q.peek() <= lectures.get(i).x) {
        q.poll();
      }
      q.add(lectures.get(i).y);
    }
    System.out.println(q.size());
  }

}
