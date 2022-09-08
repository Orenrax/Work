package Work;

public class Man {
    String name = "Al";
    int age;
    Man(int age){
        this.age=age;
    }
    Man(int age, String name){
        this.age=age;
        this.name=name;
    }
    static void work(){
        System.out.println("Пора работать или учиться (((((((((");
    }
    void eat(){
        System.out.println(name + " Пора принимать пищу");
    }
    static void walk(){
        System.out.println("Пора гулять");
    }
}
