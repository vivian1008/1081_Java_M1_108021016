import java.util.*;
public class HW7{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int EP = scn.nextInt();
        if(EP <= 120){
            System.out.printf("%.2f\n",EP * 2.10f);
            System.out.printf("%.2f\n",EP * 2.10f);
        }
        else if(EP <= 330){
            System.out.printf("%.2f\n",252 + ((EP - 120) * 3.02f));
            System.out.printf("%.2f\n",252 + ((EP - 120) * 2.68f));
        }
        else if(EP <= 500){
            System.out.printf("%.2f\n",252 + 634.2 + ((EP - 330) * 4.39f));
            System.out.printf("%.2f\n",252 + 562.8 + ((EP - 330) * 3.61f));
        }
        else if(EP <= 700){
            System.out.printf("%.2f\n",252 + 634.2 + 746.3 + ((EP - 500) * 4.97f));
            System.out.printf("%.2f\n",252 + 562.8 + 613.7 + ((EP - 500) * 4.01f));
        }
        else{
            System.out.printf("%.2f\n",252 + 634.2 + 746.3 + 994 + ((EP - 700) * 5.63f));
            System.out.printf("%.2f\n",252 + 562.8 + 613.7 + 802 + ((EP - 700) * 4.50f));
        }
    }
}