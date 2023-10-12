import java.util.Scanner;
public class Harshad {
    public static void main(String []args){
        //abundant,friendly
        Scanner scr= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scr.nextInt();

        if(num%sumOfdigit(num)==0){
            System.out.println(num + " is a harshad number");
        }
        else
            System.out.println(num+ " is a not a harshad number");
    }
    static int sumOfdigit(int num){
        int sum=0;
        while(num!=0){
            sum= num%10;
            num/=10;
        }
        return sum;
    }
}
