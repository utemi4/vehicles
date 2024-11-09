public non-sealed abstract class GroundVehicle extends Vehicle implements Moveable {

    private VehicleType vehicleType;

    public GroundVehicle(String name) {
        super(name);
        this.vehicleType = VehicleType.GROUND;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(this.vehicleType + " или же Наземного типа");
    }

    public void move() {
        System.out.println(super.name() + " движется по земле");
    }
}

interface Moveable {
    void move();
}