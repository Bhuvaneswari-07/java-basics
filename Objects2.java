class Employee{
    String name;
    int salary;
    void display(){
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);


    }
    public static void main(String[] args){
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.name="bhuna";
        e2.salary=1000;
        e1.display();
        e2.display();
    }
}
public class Objects2 {
}
