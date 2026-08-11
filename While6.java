public class While6 {
    public static void main(String[] args) {
        int n = 5423;
        int digit;
        int r = 4;

        while (n > 0) {
            digit = n % 10;
            if (digit == r) {
                System.out.println("found");
                return;
            }



            n = n / 10;
        }
        System.out.println("not found");
    }
    }

