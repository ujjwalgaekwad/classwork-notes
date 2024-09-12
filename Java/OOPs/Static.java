package Oops;

public class Static {
    public static void main(String[] args){
        //Student-1-Obj1
        person p1 = new person();
        p1.name = "Singh";
        p1.id = 1873;

        person p2 = new person(30,"Mayank");

        System.out.println(p1.name+" "+ p1.id);
        System.out.println(p2.name+" "+ p2.id);

        System.out.println(person.count);

    }
    
}

class person{   //Class
    String name;
    int id;
    
    static int count;
    //default cons
    public person(){
        count++;
        System.out.println("People");
    }

    public person(int newId, String newName){
        id = newId;
        name = newName;
        
    }
}