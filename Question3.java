import java.util.Scanner;

public class Question3{
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    float L = scn.nextFloat();
    float G = L * 0.26418f;
    System.out.printf("%.1f\n",G);
}
}