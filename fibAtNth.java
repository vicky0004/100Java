import java.util.Scanner;

public class fibAtNth {
    //factorial, power, factor
    public static void main(String []args){
        Scanner scr = new Scanner(System.in);
        System.out.print("enter the nth value: ");
        int nth= scr.nextInt();
        int a=0,b=1,nextTerm=0;

        for(int i=2;i<nth;i++){
            nextTerm=a+b;
            a=b;
            b=nextTerm;
        }
        if(nth==1)
            System.out.println(a );
        if(nth==2)
            System.out.println(b);
        if(nth>2)
            System.out.println(nextTerm);
    }
}
