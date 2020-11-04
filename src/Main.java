public class Main {

    public static void main(String[] args) {

        Car bmw = new Car("BMW", "blue");
        System.out.println(bmw.manufacturer + " " + bmw.colour);

        Car fiat = new Car("Fiat", "red");
        fiat.setManufacturer("Toyota");

        Vehicle bike = new Vehicle("Motorbike", "Yamaha", "black");

;    }
}
