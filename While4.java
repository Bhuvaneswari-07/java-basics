import java.util.Scanner;
public class While4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("n");
        int n=input.nextInt();
        int max=0;
        int i;
        while(n>0) {
            i = n % 10;
            if (i > max) {
                max = i;
            }
            n = n / 10;
        }
            System.out.println(max);
            input.close();
            }
        }




