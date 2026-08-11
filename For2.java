public class For2 {
    public static void main(String[] args){
        int n=5823;
        int sum=0;
        for(;n>0;n=n/10){
            int digit=n%10;
            sum=sum+digit;
        }
        System.out.println(+sum);
    }
}
