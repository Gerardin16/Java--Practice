package com.company;
class Base {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int x;
    private static void display() {
        System.out.println("Static or class method from Base");
    }

    public void print() {
        System.out.println("Non-static or instance method from Base");
    }
}
    class Derived extends Base {
        private static void display() {
            System.out.println("Static or class method from Derived");
        }

        public void print() {
        super.print();
        super.setX(10);
            System.out.println("Non-static or instance method from Derived"+ super.getX());
        }
    }

        public class Example {
            public static void main(String args[]) {
                Base obj = new Derived();
//                obj.display();
                obj.print();
            }
        }


