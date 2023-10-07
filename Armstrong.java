import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    public static void main(String []args){
        System.out.print("enter the number : ");
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int temp = num;
        int count=0;
        int sum=0;
        while(temp!=0) {
            temp = temp / 10;
            count++;
        }
        temp=num;
        while (temp!=0){
            sum = sum+(int) Math.pow(temp%10,count);
            temp=temp/10;
        }

        if(sum==num)
            System.out.println(num+ " is a armstrong number");
        else
            System.out.println(num+" is not a armstron number");

    }
}
