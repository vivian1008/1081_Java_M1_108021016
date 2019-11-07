import java.util.*;
public class Ex04{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        if((int)ch > 64 && (int)ch < 91){
            System.out.println(Character.toLowerCase(ch));
        }
        else{
            System.out.println(Character.toUpperCase(ch));
        }
    }
}