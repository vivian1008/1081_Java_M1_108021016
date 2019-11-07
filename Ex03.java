import java.util.*;
public class Ex03{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if(a <= b && b <= c){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}