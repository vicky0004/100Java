import java.util.Scanner;
public class factor {
    public static void main(String []args){
        Scanner scr= new Scanner(System.in);
        System.out.print("Enter the number for count factor of its :");
        int num= scr.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\ntotal= "+count);
    }
}
