import java.util.*;
public class HW5{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int price = scn.nextInt();
        if(price > 0 && price < 1001){
            if(price > 999){
                System.out.println((price / 1000) + " " + "thousand" + " " + "dollar");
            }
            else if(price > 99){
                System.out.println((price / 100) + " " + "hundred" + " " + (price % 100 / 10) + " " + "ten" + " " + (price % 10) + " " + "dollar");
            }
            else if(price > 9){
                System.out.println((price / 10) + " " + "ten" + " " + (price % 10) + " " + "dollar");
            }
            else{
                System.out.println(price + " " + "dollar");
            }
        }
    }
}