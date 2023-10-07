public class reverseNum {
    public reverseNum(int num) {
    }

    public static void main(String []args){
        int num = 4526;
        int rev=0;
        int temp =num;
        while(temp!=0){
            rev= rev*10+temp%10;
            temp = temp/10;
        }
        System.out.println(num+" "+rev);
    }
}
