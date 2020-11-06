package assing.objects_public_static;

public class Car {

    static{ //we can have a static block of code
        System.out.println("Hey, I'm static block in lectures.objects.Car");//static block is executed when the class is loaded, class is loaded when it's used.
        //java program when runs first
    }

    static String static_member = "Hey I'm static member";

    public String manufacturer;
    public String colour;
    private String vin;

    public Car(String manufacturer, String colour){
        this.manufacturer = manufacturer;
        this.colour = colour;
        this.vin = "ABC123";
    }

}
