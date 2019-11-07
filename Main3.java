import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float r = scn.nextFloat();
        float h = scn.nextFloat();
        System.out.println((double)r * r * Math.PI * h);
    }
}