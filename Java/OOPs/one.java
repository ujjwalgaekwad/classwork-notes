package Oops;

class students{
    String name;
    int age;
    int id;

    public void good(){
        System.out.println("you are a good student.");
    }

    public void nice(){
        System.out.println("Wow, you are topper!");
    }
    //This keyword
    public void name(){
        System.out.println(this.name);
    }
}

//Polymorphism

class cars{
    String name;
    int price;

    public void carInfo(String name){
        System.out.println(name);
    }

    public void carInfo(int price){
        System.out.println(price);
    }

    public void carInfo(String name, int price){
        System.out.println(name+ ""+price);
    }
}

class ujju{
    String name;
    int age;
    public void ujjuInfo(String name){
        System.out.println(name);
    }
    public void ujjuInfo(int age){
        System.out.println(age);
    }
    public void ujjuInfo(String name,int age){
        System.out.println(name+""+age);
    }
}

//Inheritance - single, multilevels, hier, hybrid 
class Shape{
    public void data(){
        System.out.println("Display areas");

    }
}
class Triangle extends Shape {
    public void area(int l,int h){
          System.out.println(1/2*l*h);
    }
}

//Abstraction
abstract class Animal {
    abstract void feet();
}

class Horse extends Animal {
    public void feet() {
        System.out.print("it has hour feet.");
    }
}

class Hen extends Animal {
    public void feet() {
        System.out.println("it has two feet");
    }
}
//2nd
class data{
    public void data(){

    }
}
class name extends data{
    public void data(){
        System.out.println("my name is ujjwal");
    }
}
class age extends data{
    public void data(){
        System.out.println("And i am 17 years old");
    }
}

public class one {
    public static void main(String[] arrgs) {
        //classes and objects
        students s1 = new students();
        s1.name = "ujju";
        s1.age = 17;
        s1.id = 1873;
        s1.good();
        System.out.println(s1.name+" "+s1.age+" "+s1.id);
        //This keyword
        s1.name();

        students s2 = new students();
        s2.name = "Dhvanit";
        s2.age= 19;
        s2.id = 001;
        System.out.println(s2.name+" "+s2.age+" "+s2.id);
        s2.nice();

        //Polymorphism
        cars c1 = new cars();
        c1.name = "bmw";
        c1.price = 1000000000;
        c1.carInfo(c1.price);

        ujju u = new ujju();
        u.name = "ujjwal";
        u.age = 17;
        u.ujjuInfo(u.name+" "+u.age);

        // Abstraction
        //1st
        Horse h = new Horse();
        h.feet();


        //2nd
        name n = new name();
        n.data();
    }
}
