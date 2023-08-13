import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        LinkedList<Integer> ll = new LinkedList<Integer>();
        LinkedList<Integer> ll2 = new LinkedList<Integer>();
        for (int i = 1; i <= N; i++) {
            ll.add(i);
        }


        while (ll.size() != 0) {
            for (int i = 1; i < K; i++) {
                ll.addLast(ll.getFirst());
                ll.removeFirst();
            }
            ll2.add(ll.getFirst());
            ll.removeFirst();
        }
     

        System.out.print("<");
        for (int i = 0; i < ll2.size(); i++) {
            System.out.print(ll2.get(i));
            if (i != ll2.size() - 1) System.out.print(", ");
        }
        System.out.print(">");
    }
}


