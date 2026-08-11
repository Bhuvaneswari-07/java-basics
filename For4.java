public class For4 {
    public static void main(String[] args){
        int n=5832;
        int max=0;
        for(;n>0;n=n/10) {
            int digit = n % 10;
            if (digit > max) {
                max = digit;
            }
        }
        System.out.println(+max);


        }

    }

