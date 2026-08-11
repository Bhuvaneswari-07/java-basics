public class While7 {
    public static void main(String[] args){
        int n=12345;
        int digit;
        while(n>0) {
            digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }

        }
    }

