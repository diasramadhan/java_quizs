public class MethodOverloading {
    public static void main(int args){
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        main(67);
        main(76.8);
    }

    public static void main(double args){
        System.out.println("Hey");
    }
}
