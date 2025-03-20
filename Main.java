class GetandSet{
    
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){

        if (age> 0){
            this.age = age;
        }
        else{
            System.out.println("Age must be greater than 0");
        }

    }

}

public class Main{
    public static void main(String[] args) {

        GetandSet g = new GetandSet();

        g.setName("Sai");
        g.setAge(25);

        System.out.println("Name : " + g.getName());
        System.out.println("Age : " + g.getAge());

    }
}