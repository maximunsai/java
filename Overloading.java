// Method Overloading (Same Method Name, Different Parameters)

public class Overloading{

    static int add(int x, int y){
        return x + y;
    }

    static String add(String x, String y){
        return x + y;
    }

    public static void main(String[] args) {

        int num = add(10, 20);
        String name = add("Artha", "Solutions");

        System.out.println(num);
        System.out.println(name);
    }

}