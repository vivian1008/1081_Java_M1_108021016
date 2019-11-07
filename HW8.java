import java.util.*;
public class HW8{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int month = scn.nextInt();
        int day = scn.nextInt();
        if(month < 2 && day < 21){
            System.out.println("Capricorn");
        }
        else if(month < 3 && day < 19){
            System.out.println("Aquarius");
        }
        else if(month < 4 && day < 21){
            System.out.println("Pisces");
        }
        else if(month < 5 && day < 21){
            System.out.println("Aries");
        }
        else if(month < 6 && day < 22){
            System.out.println("Taurus");
        }
        else if(month < 7 && day < 22){
            System.out.println("Gemini");
        }
        else if(month < 8 && day < 23){
            System.out.println("Cancer");
        }
        else if(month < 9 && day < 24){
            System.out.println("Leo");
        }
        else if(month < 10 && day < 24){
            System.out.println("Virgo");
        }
        else if(month < 11 && day < 24){
            System.out.println("Libra");
        }
        else if(month < 12 && day < 23){
            System.out.println("Scorpio");
        }
        else if(day < 22){
            System.out.println("Sagittarius");
        }
        else{
            System.out.println("Capricorn");
        }
    }
}