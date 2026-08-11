public class For5 {
    public static void main(String[] args){
        int a=0;
        int b=1;
        int next;
        for(int i=1;i<7;i++){
            System.out.println(+a);
            next=a+b;
            a=b;
            b=next;
        }

    }
}
