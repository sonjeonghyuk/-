import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int num = a / 10;
        if (num >= 9) {
            System.out.println("A");
        } else if (num >= 8){
            System.out.println("B");
        } else if (num >= 7) {
            System.out.println("C");
        } else if (num >= 6) {
            System.out.println("D");
        } else System.out.println("F");
    }
}


