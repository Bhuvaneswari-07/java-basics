public class While3 {
    public static void main(String[] args){
        int n=54355333;
        int count=0;
        int o=2;
        while(n>0) {
            int digit = n % 10;
            if (digit == o) {
                count += 1;
            }
            n = n / 10;
        }
            System.out.println(count);
            }

        }

