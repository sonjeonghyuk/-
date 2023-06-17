import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str = "";
        for (char x : a.toCharArray()){
            if((Character.isLowerCase(x))){
                str += Character.toUpperCase(x);
            }
            else {
                str += Character.toLowerCase(x);
            }
        }
        System.out.println(str);

    }
}