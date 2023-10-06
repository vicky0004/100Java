public class compnum {
    public static void main(String [] args){
        int a=2,b=5,c=1;
        twocomp(a,b);
        threecomp(a,b,c);
    }
    static void twocomp(int a,int b){
        System.out.println(Math.max(a,b)+" is greater");
        System.out.println(a>b?a:b + " is greater");
    }
    static void threecomp(int a,int b, int c){
        if(a>=b && a>=c)
            System.out.println(a+" is greater");
        else if(b>=a && b>=c)
            System.out.println(b+" is greater");
        else
            System.out.println(c+" is greater");
    }
}
