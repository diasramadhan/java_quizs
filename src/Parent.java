public class Parent {
    void m1(){
        System.out.println("Method 1");
    }
    class Child extends Parent{
        void m2(){
            System.out.println("Method 2");
        }
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1();

        Parent.Child child = parent.new Child();
        child.m1();
        child.m2();
    }
}


