public non-sealed abstract class WaterVehicle extends Vehicle {

    private VehicleType vehicleType;

    public WaterVehicle(String name) {
        super(name);
        this.vehicleType = VehicleType.WATER;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(this.vehicleType + " или же Водного типа");
    }

    public void move() {
        System.out.println(this.name() + " плывёт");
    }
}
