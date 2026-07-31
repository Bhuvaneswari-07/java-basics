public class ConditionalStatements {
    public static void main(String[] args){
        int units=250;
        int bill;
        if (units>100 && units<200) {
            bill = units * 2;
            System.out.println(bill);
        }
        else if(units>200 && units<300) {
            bill = units * 3;
            System.out.println(bill);
        }
        else
            System.out.println("its exceeds units range");
    }
}
