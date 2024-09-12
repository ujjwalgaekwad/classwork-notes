package Oops;



class Student{  //Polymorphism
    String name;
    int age;
    String address;
    float marks;

    public void info(String name){
      System.out.println(name);
    }

    public void info(int age){
        System.out.println(age);
    }

    public void info(String address,float marks){
        System.out.println(address+" "+marks);
    }

    public void info(String name, int age) {
        System.out.println(name +" "+age);
    }
}


public class Polymorphism {
    public static void main(String[] args){
        Student s1 = new Student();  //Polymorphism
        s1.name = "ujjwal";
        s1.age = 17;
        s1.address = "ahmedabad";
        s1.marks = 70;

        s1.info(s1.name);
        s1.info(s1.address+ " "+s1.marks);
    }

}
