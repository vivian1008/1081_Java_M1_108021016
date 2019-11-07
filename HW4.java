import java.util.*;
public class HW4{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if(a <= b && b <= c){
            if((a*a)+(b*b)<(c*c)){
                System.out.println("Obtuse triangle");
            }
            else if((a*a)+(b*b)==(c*c)){
                System.out.println("Right triangle");
            }
            else{
                System.out.println("Acute triangle");
            }
        }
    }
}