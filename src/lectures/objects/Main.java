package lectures.objects;

public class Main {

    public static void main(String[] args) {

        //static_member demo
        System.out.println(Car.static_member);

        Car bmw = new Car("BMW", "blue");
        System.out.println(bmw.manufacturer + " " + bmw.colour);
        //reassignment
        System.out.println("bmw ref: " + bmw);
        //bmw = new lectures.objects.Car("bmw", "blue"); can't modify final object or primitive variable
        System.out.println("bmw ref: " + bmw);

        bmw.manufacturer = "Mercedes"; //can modify object even if variable is final
        System.out.println(bmw.manufacturer + " " + bmw.colour);

        //passing args
        int b = 3;
        modifyInt(b);
        System.out.println("b=" + b);

        System.out.println("lectures.objects.Car " + bmw.manufacturer);
        modifyCar(bmw);
        System.out.println("lectures.objects.Car " + bmw.manufacturer);


    }
    public static void modifyInt(int a) {//if you pass in a primitive into a method and modify it there  it doesn't actually change it
        System.out.println("a=" + a);
        a = 100;
    }

    public static void modifyCar(Car car){ //if you pass in an object into a method and modify if inside the method it's gonna be modified after it exits the method.
        System.out.println("car+" + car);
        car.manufacturer = "Audi";
    }


}
