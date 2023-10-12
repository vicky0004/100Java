import java.util.Scanner;
public class abundant {
    public static void main(String [ ]args){
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scr.nextInt();
        if(num<sumOfFactor(num)){
            System.out.println(num+" is a abundent number");
        }
        else
            System.out.println(num+" is not a abundent number");
    }
    static int sumOfFactor(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0)
                sum+=i;
        }

        return sum;
    }
}
