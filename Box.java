public class Box  {
    double width;
    double height;
    double depth;


    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }


    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }


    Box(double len) {
        width = height = depth = len;
    }


    double volume() {
        return width * height * depth;
    }
}

    class OverloadCons {
        public static void main(String args[]) {

            Box b1 = new Box(10, 20, 15);
            Box b2 = new Box();
            Box b3 = new Box(7);

            double vol;

            vol = b1.volume();
            System.out.println("Volume of b1 = " + vol);

            vol = b2.volume();
            System.out.println("Volume of b2 = " + vol);

            vol = b3.volume();
            System.out.println("Volume of b3 = " + vol);
        }
    }

