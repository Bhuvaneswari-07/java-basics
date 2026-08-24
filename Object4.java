class Student{
    void result(String name,int m1,int m2,int m3) {
        int avg = (m1 + m2 + m3) / 3;
        System.out.println("name" + name);
        System.out.println("1st=" + m1);
        System.out.println("2st=" + m2);
        System.out.println("3st=" + m3);
        System.out.println("average=" + avg);
        if (avg > 40) {
            System.out.println("pass");

        } else {
            System.out.println("fail");
        }
    }
        public static void main(String[] args){
            Student s1=new Student();
            Student s2=new Student();
            Student s3=new Student();
            s1.result("a",60,60,70);
            s2.result("b",20,30,20);
            s3.result("c",100,90,80);


    }



}
public class Object4 {
}
