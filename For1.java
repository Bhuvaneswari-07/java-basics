import java.util.Scanner;
public class For1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter n:");
        int n=input.nextInt();
        int rev=0;

        for(;n>0;n=n/10) {
            int digit = n % 10;
            rev = rev * 10 + digit;


        }
        System.out.println(+rev);
        input.close();
        }
    }

