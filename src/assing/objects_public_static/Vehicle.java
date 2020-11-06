package assing.objects_public_static;

public class Vehicle {
    public String type;
    public String manufacturer;
    public String colour;
    private String owner;

    public Vehicle(String type, String manufacturer, String colour){
        this.type = type;
        this.manufacturer = manufacturer;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", colour='" + colour + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
