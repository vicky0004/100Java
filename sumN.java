import java.util.Scanner;

public class sumN {
    public static void main(String []args){
        int n=0;
        int sum=0;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number: ");
         n = scr.nextInt();
        System.out.println("sum = " + sum(n));
        System.out.println("sum b/t 5-9 = "+sumrange(sum,1,9));
    }
    static int sum(int n){
        if(n==0)
            return 0;
        else
            return n+ sum(n-1);
    }
    static int sumrange(int sum,int i,int j){
        if(i>j)
            return sum;
        else
            return i + sumrange(sum,i+1,j);
    }
}
