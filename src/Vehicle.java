public abstract sealed class Vehicle permits GroundVehicle, AirVehicle, WaterVehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("Средство передвижения с названием: " + this.name);
    }

    public String name() {
        return this.name;
    }

}
