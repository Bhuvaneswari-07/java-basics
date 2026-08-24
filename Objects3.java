class Rectangle{
    int length;
    int breadth;

    void area() {
        System.out.println("length=" + length);
        System.out.println("breadth=" + breadth);
        int ar=(length*breadth);
        System.out.println("area=" + ar);
    }
        public static void main(String[] args){
            Rectangle a=new Rectangle();
            a.length=10;
            a.breadth=20;
            a.area();

        }
    }

public class Objects3 {
}
