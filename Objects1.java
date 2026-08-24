class Car{
    int model;
    String brand;
    void car1(){
        System.out.println("model="+model);
        System.out.println("brand="+brand);

    }
    public static void main(String[] args){
        Car c1=new Car();
        c1.model=12;
        c1.brand="tesla";
        c1.car1();
    }
}
