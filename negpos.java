import java.util.Scanner;

public class negpos {
    public static void main(String [] args){
        Scanner scr = new Scanner(System.in);

        System.out.print("enter the number: ");
        int num = scr.nextInt();
        if(num>0)
            System.out.println("number is positive");
        else if (num<0) {
            System.out.println("number is negative");
        }
        else{
            System.out.println("zero");
        }
    }
}
