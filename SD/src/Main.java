import java.util.List;

abstract class Employee{
    int age=29;
    String name="gulpujjj";
//    Employee(int age,String name){
//    this.age=age;
//    this.name=name;
//    }
//    Employee(){
//
//    }
    void display(){
        System.out.println(this.age+" "+this.name);
    }
}
class Software extends Employee{
    int age=76;
    String name="rahim";

    void display(){
        System.out.println("Hrere "+this.age);
    }
}
public class Main {
    public static void main(String[] args) {
Employee obj1=new Software();
Employee obj2=new Employee(){};
obj1.display();
obj2.display();

    }
}