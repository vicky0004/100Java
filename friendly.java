/*Given Two integer inputs as the numbers, the objective is to check whether the ratio of the sum of the factors of the number except the number
    itself upon the number, of the both numbers, matches or not. Therefore, we’ll write a code to Check Whether or Not the Two Numbers are a
    Friendly Pair in Java Language. */
import java.util.Scanner;
public class friendly {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=scr.nextInt();
        System.out.print("Enter the second number: ");
        int num2=scr.nextInt();
        int sum1= factorSum(num1);
        int sum2= factorSum(num2);
        if(sum1/num1 == sum2/num2){
            System.out.println("yes");
        }
        else
            System.out.println("no");
    }
    static int factorSum(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                sum+=i;
        }
        return sum;
    }

}
