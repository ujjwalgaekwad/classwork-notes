class Student {  //Single Inheritance
   String Sname;
   int Sid;
}

class Classroom extends Student {
    void classdata(){
        System.out.println("Class 12th Batch-2");
    } 
}



class Student1 { //Multilevel Inheritance
    public void work1(){
        System.out.println("Garba classes -7:00");
    }
}

class Ujjwal extends Student1 {
    public void workdata(){
       
    }
}

class Student2 extends Ujjwal {
    public void work2(){
        System.out.println("Self Study");
    }
}



class StudentInfo {  //Hierachical Inheritance
    public void Sinfo(){
        System.out.println("Student information");
    
    }
}

class info1 extends StudentInfo{
    public void studentName(){
       System.out.println("ujju");
    }
}

class info2 extends StudentInfo{
    public void studentId(){
       System.out.println("1873");
    }
}


class A{  //Hybrid Inheritance
    public void A1(){
        System.out.println("A data");
    }
}

class B extends A{
    public void B1(){
        System.out.println("B data");
    }
}
class C extends A{
    public void C1(){
        System.out.println("C data");
    }
}
class D extends B{
    public void D1(){
        System.out.println("D data");
    }
}


public class Inheritance {
    public static void Single(String[] args){
       
    }

}
