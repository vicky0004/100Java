import java.lang.Math;
public class armstrongInRange {
    public static void main(String []args){
        int count=0;
        int low=1;
        int high= 200;
        for(int i= low;low<high;low++){
            int len,temp,sum=0,digit;
            temp=low;
            len= getOrder(temp);

            while(temp!=0){
                digit = temp%10;
                sum= sum+(int)Math.pow(digit,len);
                temp=temp/10;
            }
            if(low==sum){
                System.out.println(low+" ");
                count++;
            }
        }
        if(count==0)
            System.out.println("no arm number in this range");
    }
     static int getOrder(int num){
        int len=0;
        while(num!=0)
        {
            num=num/10;
            len++;
        }
        return len;
    }
}
