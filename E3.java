import java.util.Scanner;
public class E3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter m:");
        int m=input.nextInt();
        if(m>80&&m<100)
            System.out.println("a grade");
        else if(m>60 &&m<80)
            System.out.println("b grade");
        else
            System.out.println("c grade");
        input.close();
    }
}
