package Oops;

public class class_and_obj {
    public static void main(String[] args){
        //Student-1-Obj1
        classroom s1 = new classroom();
        s1.name = "Singh";
        s1.id = 1873;
        s1.address = "Ahmedabad";
        System.out.println(s1.name+" "+ s1.id +" "+s1.address);
        
        //Student-2-Obj2
        classroom s2 = new classroom();
        s2.name = "Aryan";
        s2.id = 2021;
        s2.address = "Kalupur";
        System.out.println(s2.name+" "+s2.id+" "+s2.address);

        //Student-3-Obj3
        classroom s3 = new classroom();
        s3.name = "Anil";
        s3.id = 1874;
        s3.address = "Bhavnagar";
        System.out.println(s3.name+" "+s3.id+" "+s3.address);

        //function call
        s1.in();
        s3.into();

    }
    
}

class classroom{   //Class
    String name;
    int id;
    String address;

    //function
    void in(){
        System.out.println(name +" in classroom. ");
    }
    void into(){
        System.out.println(name +" may i coming ma'am ");
    }
}