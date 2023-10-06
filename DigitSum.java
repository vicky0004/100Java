public class DigitSum {
    public static void main(String []args){
        int num=1234;
        int sum=0;
        System.out.println("number = "+num+" and sum of digit = "+getSum(num,sum));
    }
    static int getSum(int num,int sum){
        if(num==0)
            return sum;
        sum+=num%10;
        return getSum(num/10,sum);

    }
}
