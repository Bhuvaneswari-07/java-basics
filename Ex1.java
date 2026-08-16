public class Ex1 {
    public static void main(String[] args) {
        int n = 1234;
        int i = n;
        int count = 0;
        int l = 0;
        int s = 9;
        while (i > 0) {
            int digit = i % 10;
            count++;
            if (digit > l) {
                l = digit;
            }
            if (digit < s) {
                s = digit;
            }

            i = i / 10;

        }
        System.out.println("largest=" + l);
        System.out.println("smallest=" + s);
        System.out.println("count=" + count);
    }
}


