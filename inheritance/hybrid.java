package inheritance;

    class Parent {
        public void M1() {
            System.out.println("Parent Class Method");
        }
    }

    class Child extends Parent {
        public void M2() {
            System.out.println("Child Class Method");
        }
    }

    class Inh_In_Java {
        public static void main(String[] args) {


            Parent p = new Parent();
            Parent p1 = new Child();

            p.M1();
        }
    }

