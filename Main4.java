import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        if(a <= 1000 && b <= 1000){
            System.out.println(a + "+" + b + "=" + (a + b));
            System.out.println(a + "*" + b + "=" + (a * b));
            System.out.println(a + "-" + b + "=" + (a - b));
            System.out.println(a + "/"+ b + "=" + a / b + "..." + a % b);
        }
    }
}