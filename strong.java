import java.util.Scanner;

//sum of each digit's sum equal
public class strong {
    //sum of factorial of digits = itself
    public static void main(String []args){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scr.nextInt();
        int cmp,temp;
        if(num== (sumOfFactOfDigit(num))){
            System.out.println(num +" is a strong number ");
        }
        else
            System.out.println(num +" is not a strong number");
    }
    static int  sumOfFactOfDigit(int num){
        int sum=0;
        int  digit;
        while(num!=0){
            digit= num%10;
            sum=sum+factorial(digit);
            num=num/10;
        }
        return sum;
    }
    static int factorial(int num){
        int sum=1;
        for(int i=1;i<=num;i++){
            sum=sum*i;
        }
        return sum;
    }
}
