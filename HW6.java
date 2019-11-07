import java.util.*;
public class HW6{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        if((int)ch > 64 && (int)ch < 91){
            System.out.println("uppercase");
        }
        else if((int)ch > 96 && (int)ch < 123){
            System.out.println("lowercase");
        }
        else{
            System.out.println("special character");
        }
    }
}