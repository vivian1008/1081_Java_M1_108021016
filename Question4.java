import java.util.Scanner;

public class Question4{
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        String str1 = scn.nextLine();
        char a = scn.next().charAt(0);
        String str2 = str1.replace(a,'\n');
        System.out.println(str2);
    }
}