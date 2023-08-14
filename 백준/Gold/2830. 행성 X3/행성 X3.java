import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] one = new int[20];
        int num;
        int tmp = 0;
        int index;
        long answer = 0L;

        for(int i=0; i<n; i++){
            num = Integer.parseInt(sc.nextLine());
            index = 0; 
 
            while(num != 0){
                tmp = num%2;
                num = num/2;
                if(tmp == 1){
                    one[index]++;
                }
                index++;
            }
        }

        for(int i=0; i<20; i++){
            answer += (1L<<i)*one[i]*(n-one[i]);
        }

        System.out.println(answer);

    }
}