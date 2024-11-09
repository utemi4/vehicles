public class Helicopter extends AirVehicle {
    private String manufacturer;

    public Helicopter(String name, String prod) {
        super(name);
        this.manufacturer = prod;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Производитель вертолёта: " + this.manufacturer);
    }
}
