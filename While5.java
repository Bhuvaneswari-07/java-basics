import javax.swing.*;

public class While5 {
    public static void main(String[] args){
        int n=15273786;
        int ec=0;
        int oc=0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                ec += 1;
            }
            else{
                oc=oc+1;
            }
            n = n / 10;
        }
        System.out.println(ec);
        System.out.println(oc);




    }
        }


