import java.util.Scanner;
public class automorphic {
    //last digit of sqr = last digit of number
    public static void main(String []args){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= scr.nextInt();
        int ldigit=num%10;
        int lsqr= (num*num)%10;
        if(ldigit==lsqr)
            System.out.println(num+" is automorphic number");
        else
            System.out.println(num+" is not automorphic number");
    }

}
