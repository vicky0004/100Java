public class primeInRange {
    public static void main(String []args){
        int a=25;
        int b=50;
        for(int i=a;i<b;i++){
            if(isPrime(i))
                System.out.println(i+" ");
        }
    }
    static boolean isPrime(int x){
        for(int i=2;i<x/2;i++){
            if(x%i==0)
                return false;
        }
        return true;
    }
}
