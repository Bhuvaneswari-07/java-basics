public class Loops1 {
    public static void main(String[] args){
        int n=153;
        int o=n;
        int sum=0;
        for(;n>0;n=n/10) {
            int digit = n % 10;
            sum = sum+(digit*digit*digit);
        }
        if(sum==o) {
                System.out.println("armstrong");
            }
        else{
                System.out.println("not armstrong");
                }
            }
        }


