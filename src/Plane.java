public class Plane extends AirVehicle {

    private String manufacturer;

    public Plane(String name, String prod) {
        super(name);
        this.manufacturer = prod;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Самолёт производителя " + this.manufacturer);
    }
}
