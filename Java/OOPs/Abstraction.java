package Oops;
abstract class SportsCar{
    abstract void Speed();
    public void expensive(){
        System.out.println("Expensive car, you are not afford.");
    }
}

class Bmw extends SportsCar{
    public void Speed(){
        System.out.println("BMW Top Speed: 190 MPH");
    }
}

class Mustang extends SportsCar{
    public void Speed(){
        System.out.println("Mustang GT Top Speed: 155 mph");
    }
}

class Mercedes extends SportsCar{
    public void Speed(){
        System.out.println("The Mercedes-Benz fastest car is the Mercedes-AMG® ONE, top speed is a whopping 219 mph");
    }
}

class Ferrari extends SportsCar{
    public void Speed(){
        System.out.println("The Ferrari SF90 Stradale and the Ferrari SF90 Spider both have a top speed of 211 mph (340 km/h).");
    }
}

class Bugatti extends SportsCar{
    public void Speed(){
        System.out.println("Bugatti Chiron Super Sport — 304.7 MPH.");
    }
}


public class Abstraction {
    public static void main(String[] args){
        Bmw bmw = new Bmw();
        bmw.Speed();
        bmw.expensive();



    }
}
