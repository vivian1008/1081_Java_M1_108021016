import java.util.Scanner;

public class Question2{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int g1 = scn.nextInt();
        int g2 = scn.nextInt();
        int g3 = scn.nextInt();
        System.out.println(g1+g2+g3);
        System.out.println((g1+g2+g3)/3);
    }
}