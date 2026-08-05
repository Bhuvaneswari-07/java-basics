import java.util.Scanner;

public class While2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a:");
        int a=input.nextInt();
        int original=a;
        int rev=0;
        while(a>0) {
            int digit = a % 10;
            rev = rev * 10 + digit;
            a = a / 10;


        }
        if(original==rev) {
            System.out.println("palindrome");
        }
        input.close();


    }
}

