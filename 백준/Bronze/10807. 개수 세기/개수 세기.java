import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        int v = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v)  cnt++;
        }
        System.out.println(cnt);
    }
}
