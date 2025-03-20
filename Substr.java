public class Substr{
    public static void main(String[] args){

        String str = "hello@gmail.com";

        if (str.contains("@") && str.contains(".com")){
            System.out.println("Valid email");
        }else{
            System.out.println("Invalid email");
        }
    }
}