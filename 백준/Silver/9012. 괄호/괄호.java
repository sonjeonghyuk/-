import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[num];
        int cnt = 0;

        for (int i = 0; i < num; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    cnt++;
                } else if (str.charAt(j) == ')') {
                    cnt--;
                }
                if (cnt < 0) {
                    arr[i] = "NO";
                    break;
                }
            }

            arr[i] = cnt == 0 ? "YES" : "NO";
            cnt = 0;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}