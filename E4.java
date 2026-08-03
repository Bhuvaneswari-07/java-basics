import java.util.Scanner;
public class E4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("n");
        int n=input.nextInt();
        System.out.println("m");
        int m=input.nextInt();
        System.out.println("o");
        String o=input.next();
        if(o.equals("+"))
            System.out.println("addition is"+(n+m));
        else if(o.equals("-"))
        System.out.println("subtraction is"+(n-m));
        else if(o.equals("*"))
        System.out.println("product is"+(n*m));
        else
            System.out.println("not avalablr");
        input.close();
    }
}
