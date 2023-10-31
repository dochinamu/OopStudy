import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class problem3 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine(); // 'readLine()'으로 수정
            StringTokenizer st = new StringTokenizer(s, " "); // 공백으로 구분

            int A = Integer.parseInt(st.nextToken()); // 'nextToken()'으로 수정
            int B = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            int days = 1;
            int now = 0;

            while (now < V) {
                now += A;
                if (now >= V) {
                    break;
                }
                now -= B;
                days++;
            }
            System.out.println(days);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
