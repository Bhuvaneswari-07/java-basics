import java.util.Scanner;
public class Switch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, per;
        System.out.println("enter marks in a,b,c");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        while(true){
        System.out.println("1-total marks obtained");
        System.out.println("2-percentage");
        System.out.println("3-grade obtained");
        System.out.println("4-exit");
        System.out.println("enter choice");
        int ch = input.nextInt();
        sum = a + b + c;
        per = (sum * 100) / 300;

            switch (ch) {
                case 1:
                    System.out.println(+sum);
                    break;
                case 2:
                    System.out.println(+per);
                    break;
                case 3:
                    if (per > 90)
                        System.out.println("a grade");
                    else if (per > 70 && per < 90)
                        System.out.println("b grade");
                    else
                        System.out.println("fail");
                case 4:
                    input.close();
                    return;

            }

        }
    }
}