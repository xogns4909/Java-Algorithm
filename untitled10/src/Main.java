import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Point {

  int start;
  int end;

  public Point(int start, int end) {
    this.start = start;
    this.end = end;

  }
}

public class Main {


    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      PriorityQueue<Integer> pr = new PriorityQueue<>();
      int n = Integer.parseInt(br.readLine());
      List<Point> times = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        times.add(new Point(start, end));
      }

      sortByStartTime(times);

      solve(pr, n, times);
      System.out.println(pr.size());
    }

    private static void solve(PriorityQueue<Integer> pr, int n, List<Point> times) {
      pr.add(times.get(0).end);
      for(int i = 1; i< n; i++){
        if(pr.peek() <= times.get(i).start){
          pr.poll();
        }
        pr.add(times.get(i).end);
      }
    }


    private static void sortByStartTime(List<Point> times) {
      Collections.sort(times, new Comparator<Point>() {
        @Override
        public int compare(Point o1, Point o2) {
          return o1.start - o2.start;
        }
      });
    }
  }

