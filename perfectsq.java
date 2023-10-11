import java.lang.Math;
import java.util.Scanner;
public class perfectsq {
    //roots are integer
    public static void main(String []args){
        Scanner scr= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scr.nextInt();
        if((Math.floor((double)Math.sqrt((double)num)))==(Math.ceil((double)Math.sqrt((double)num)))){
            System.out.println("yes ");
        }
        else{
            System.out.println("no");
        }
    }
}
