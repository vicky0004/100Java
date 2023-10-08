import java.util.Scanner;
public class fibbonaci {
    public static void main(String args[]){
        Scanner scr= new Scanner(System.in);
        System.out.print("enter the limit: ");
        int limit= scr.nextInt();
        int a=0,b=1,nextTerm;

        System.out.print(a+" "+b+" ");
        for(int i=2;i<limit;i++){
            nextTerm=a+b;
            a=b;
            b=nextTerm;
            System.out.print(nextTerm+" ");
        }


    }
}
