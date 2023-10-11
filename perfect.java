import java.util.Scanner;

public class perfect {
    public static void main(String []args){
        //sum of factor excluded it = it
        Scanner scr= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scr.nextInt();
        int sum;
        if(num==(sum(num))){
            System.out.println(num +" is a perfect number");
        }
        else
            System.out.println(num+" is not a perfect number");
    }
    static int sum(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum= sum+i;
            }

        }
        return sum;
    }
}
