
    class OverloadMethod {

        public void display(char c) {
            System.out.println(c);
        }

        public void display(int c) {
            System.out.println(c);
        }
    }

    class Sample {

        public static void main(String args[]) {

            OverloadMethod o = new OverloadMethod();

            o.display('a');
            o.display(10);
        }
    }
