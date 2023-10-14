public class octalTodec {
    public static void main(String []args){
        int num=512;
        int digit;
        int decimal=0;
        int n=0;

        while(num!=0){
            digit= num%10;
            decimal= decimal+ digit*(int)Math.pow(8,n);
            n++;
            num/=10;
        }
        System.out.println(decimal);
    }
}
