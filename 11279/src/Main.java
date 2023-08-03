import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++){
            int x = scanner.nextInt();

            if (x == 0){
                if (pq.isEmpty())
                    System.out.println(0);
                else System.out.println(pq.poll());
            }
            else {
                pq.add(x);
            }
        }
    }
}
	