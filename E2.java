import java.util.Scanner;
public class E2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter n:");
        System.out.println("enter m:");
        System.out.println("enter k:");
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        if (n > m && n > k)
            System.out.println("largest:"+n);
        else if(m>n && m>k)
            System.out.println("largest:"+m);
        else
            System.out.println("largest:"+k);
        input.close();
    }
}
