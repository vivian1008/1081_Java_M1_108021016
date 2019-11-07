import java.util.*;
public class HW3{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        if(x<-1){
            System.out.println(x*x*3);
        }
        else if(x >= -1 && x <= 1){
            System.out.println(Math.pow(x,3)+3*x-3);
        }
        else
        System.out.println(2*x+3);
    }
}