import java.util.Scanner;
public class Switch1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int balance=5000;
        System.out.println("1.balance");
        System.out.println("2.after depositing money balance");
        System.out.println("3.withdrawmoney and balance");
        System.out.println("enter choice:");
        int ch=input.nextInt();

        switch(ch){
            case 1:
                System.out.println(+balance);
                break;
            case 2:
                System.out.println("enter amount to be deposited:");
                        int amount=input.nextInt();
                balance=balance+amount;
                System.out.println("after deposit the balance is"+balance);
                break;
            case 3:
                System.out.println("enter amount to be withdraw:");
                    int withdraw=input.nextInt();
                balance=balance-withdraw;
                System.out.println("after withdraw blance is:"+balance);
                break;

            default:
                System.out.println("invalid choice");


            input.close();
        }
    }
}
