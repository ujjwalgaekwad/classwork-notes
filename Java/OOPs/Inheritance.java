class Student {  //Single Inheritance
   String Sname;
   int Sid;
}

class Classroom extends Student {
    public void classdata(){
        System.out.println("Class 12th Batch-2");
    } 
}


class Work1 { //Multilevel Inheritance
    public void workA(){
        System.out.println("Garba classes -7:00");
    }
}

class Ujjwal extends Work1 {
    public void workdata(){
       
    }
}

class Work2 extends Ujjwal {
    public void workB(){
        System.out.println("Self Study");
    }
}

public class Inheritance {
    public static void Single(String[] args){
        Classroom c1 = new Classroom();
        c1.Sname = "ujjwal";
        c1.Sid = 1873;
        c1.classdata();
        System.out.println(c1.Sname+" "+c1.Sid);
    }

    public static void Multilevel(String[] args){
        Ujjwal u1 = new Ujjwal();
       // Ujjwal u2 = new Ujjwal();
        u1.workA();
       
    }
}