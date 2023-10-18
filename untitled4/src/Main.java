import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    Long result = 0L;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
    PriorityQueue<Long> q= new PriorityQueue<Long>();
    int count = Integer.parseInt(st.nextToken());

    for(int i =0; i< count; i++){
       q.add(Long.parseLong(bufferedReader.readLine()));
    }
    if(q.size() == 1){
      result = 0L;
    }
    while(q.size() >= 2){
      Long a = (q.poll() + q.poll());
      result += a;
      q.add(a);
    }
    System.out.println(result);
  }
}
