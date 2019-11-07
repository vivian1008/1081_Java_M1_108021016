import java.util.*;
public class Ex02{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        if(Math.sqrt(x*x+y*y)>100){
            System.out.println("outside");
        }
        else{
            System.out.println("inside");
        }
    }
}