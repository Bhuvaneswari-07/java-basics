public class Cf4 {
    public static void main(String[] args){
        int n=5683;
        int max=0;
        int sl=0;
        while(n>0){
            int digit=n%10;
            if(digit>max){
                sl=max;
                max=digit;
            }
            else if(digit>sl){
                sl=digit;
            }
            n=n/10;

        }
        System.out.println(+max);
        System.out.println(+sl);
    }}
