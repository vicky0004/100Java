import java.util.Scanner;

public class power {
    public static void main(String []args){
        int power=1;
        Scanner scr= new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a= scr.nextInt();
        System.out.print("Enter the value of b: ");
        int b= scr.nextInt();
        for(int i=0;i<b;i++){
            power*=a;
        }
        System.out.println(a+"power"+b+" = "+power);
    }
}
