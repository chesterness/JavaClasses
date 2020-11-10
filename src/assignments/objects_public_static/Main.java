package assignments.objects_public_static;

public class Main {
    public static void main(String[] args) {

        //Task after lesson 3.11.2020.
        Car fiat = new Car("Fiat", "red");
        fiat.manufacturer = "Toyota";

        Vehicle bike = new Vehicle("Motorbike", "Yamaha", "black");
        System.out.println(bike.toString());

    }
}
