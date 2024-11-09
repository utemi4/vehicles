public non-sealed abstract class AirVehicle extends Vehicle implements Flyable {

    private VehicleType vehicleType;

    public AirVehicle(String name) {
        super(name);
        this.vehicleType = VehicleType.AIR;
    }

    public class AircraftEngine {

        public void inner_info() {
            System.out.println("Авиационный двигатель");
        }
    }

    @Override
    public void info() {
        super.info();
        System.out.println(this.vehicleType + " или же Воздушного типа");
    }

    public void move() {
        System.out.println(super.name() + " летит");
    }
}

interface Flyable {
    void move();
}
