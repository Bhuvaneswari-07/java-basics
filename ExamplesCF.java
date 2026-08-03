import java.util.Scanner;

public class ExamplesCF {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
         int n=sc.nextInt();
         if(n%2==0)
             System.out.println("even");
         else
             System.out.println("odd");
         sc.close();

    }

}
