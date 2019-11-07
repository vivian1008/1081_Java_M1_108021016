import java.util.*;
public class Ex01{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int height = scn.nextInt();
        int gender = scn.nextInt();
        float mw = (height-80)*0.7f;
        float fw = (height-70)*0.6f;
        if(gender==1){
            System.out.printf("%.1f\n",mw);
        }
        else{
            System.out.printf("%.1f\n",fw);
        }
    }
}