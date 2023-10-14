import java.lang.Math;
public class BinaryToDec {
    public static void main(String []args){
        int num=1010;
        int digit;
        int decimal=0;
        int n=0;

        while(num!=0){
            digit= num%10;
            decimal= decimal+ digit*(int)Math.pow(2,n);
            n++;
            num/=10;
        }
        System.out.println(decimal);
    }
}
  