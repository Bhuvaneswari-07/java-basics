public class Oc1 {
    public static void main(String[] args) {

        int n = 12233344;
        int i = n;

        while (i > 0) {

            int digit1 = i % 10;
            int temp = n;
            int count = 0;

            while (temp > 0) {

                int digit2 = temp % 10;

                if (digit1 == digit2) {
                    count++;
                }

                temp = temp / 10;
            }

            if (count == 1) {
                System.out.println(digit1);
            }

            i = i / 10;
        }
    }
}